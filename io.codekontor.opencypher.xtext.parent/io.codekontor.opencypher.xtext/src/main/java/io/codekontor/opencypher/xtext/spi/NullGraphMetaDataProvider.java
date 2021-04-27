/**
 * openCypher Xtext - Slizaa Static Software Analysis Tools
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
package io.codekontor.opencypher.xtext.spi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import io.codekontor.opencypher.xtext.api.IGraphDatabaseMetaDataProvider;


public class NullGraphMetaDataProvider implements IGraphDatabaseMetaDataProvider {

	@Override
	public List<String> getNodeLabels() {
		return Collections.emptyList();
	}

	@Override
	public List<String> getPropertyKeys() {
		return Collections.emptyList();
	}

	@Override
	public List<String> getRelationshipTypes() {
		return Collections.emptyList();
	}
	
	@Override
	public Map<String, String> getFunctions() {
		return Collections.emptyMap();
	}
}
