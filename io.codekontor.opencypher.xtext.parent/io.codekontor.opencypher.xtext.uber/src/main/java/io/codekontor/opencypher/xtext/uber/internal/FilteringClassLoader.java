/**
 * openCypher Xtext Uber JAR - Slizaa Static Software Analysis Tools
 * Copyright © ${year} Code-Kontor GmbH and others (slizaa@codekontor.io)
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Code-Kontor GmbH - initial API and implementation
 */
package io.codekontor.opencypher.xtext.uber.internal;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class FilteringClassLoader extends ClassLoader {

	private static final ClassLoader PLATFORM_CLASS_LOADER;

	private List<String> _allowedPackagesList;

	static {
		PLATFORM_CLASS_LOADER = ClassLoader.getPlatformClassLoader();

		try {
			ClassLoader.registerAsParallelCapable();
		} catch (NoSuchMethodError ignore) {
			// Not supported on Java 6
		}
	}

	public FilteringClassLoader(ClassLoader parent) {
		super(parent);

		_allowedPackagesList = loadAllowedPackagesList();
	}

	@Override
	protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {

		//
		try {
			return PLATFORM_CLASS_LOADER.loadClass(name);
		} catch (ClassNotFoundException ignore) {
			// ignore
		}

		//
		if (!isClassAllowed(name)) {
			throw new ClassNotFoundException(name + " not found.");
		}

		//
		Class<?> cl = super.loadClass(name, false);
		if (resolve) {
			resolveClass(cl);
		}

		//
		return cl;
	}

	@Override
	public String toString() {
		return FilteringClassLoader.class.getSimpleName() + "(" + getParent() + ")";
	}

	/**
	 * @param className
	 * @return
	 */
	private boolean isClassAllowed(String className) {

		//
		for (String allowedPackage : _allowedPackagesList) {
			if (className.startsWith(allowedPackage)) {
				return true;
			}
		}

		//
		return false;
	}

	private static List<String> loadAllowedPackagesList() {
		try (InputStream resource = FilteringClassLoader.class
				.getResourceAsStream("/io-codekontor-opencypher-xtext-uber-allowed-packages")) {
			
			return new BufferedReader(new InputStreamReader(resource, StandardCharsets.UTF_8)).lines()
					.collect(Collectors.toList());
		} catch (Exception exception) {
			exception.printStackTrace();
			throw new RuntimeException(exception);
		}
	}
}