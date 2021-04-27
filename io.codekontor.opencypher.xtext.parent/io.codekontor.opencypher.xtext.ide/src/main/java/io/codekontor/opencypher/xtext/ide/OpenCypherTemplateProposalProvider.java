/**
 * openCypher Xtext IDE - Slizaa Static Software Analysis Tools
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
package io.codekontor.opencypher.xtext.ide;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.ide.editor.contentassist.AbstractIdeTemplateProposalProvider;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalPriorities;

import com.google.inject.Inject;

import io.codekontor.opencypher.xtext.api.IGraphDatabaseMetaDataProvider;

public class OpenCypherTemplateProposalProvider extends AbstractIdeTemplateProposalProvider {

	@Inject
	private IdeContentProposalPriorities proposalPriorities;

	@Inject
	private IGraphDatabaseMetaDataProvider graphMetaDataProvider;

	public void createLabelNameRuleProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		nullSafe(() -> graphMetaDataProvider.getNodeLabels(), label -> acceptProposal(label, label, template(label),
				context, acceptor, true, ContentAssistEntry.KIND_VALUE));
	}

	public void createPropertyKeyNameRuleProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {

		nullSafe(() -> graphMetaDataProvider.getPropertyKeys(),
				key -> acceptProposal(key, key, template(key), context, acceptor, true, ContentAssistEntry.KIND_VALUE));
	}

	public void createRelTypeNameRuleProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {

		nullSafe(() -> graphMetaDataProvider.getRelationshipTypes(),
				relationshipType -> acceptProposal(relationshipType, relationshipType, template(relationshipType),
						context, acceptor, true, ContentAssistEntry.KIND_VALUE));
	}

	public void createMatchRuleProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {

		acceptProposal("match", "Match()", template("MATCH (${1}) ${0}"), context, acceptor, true,
				ContentAssistEntry.KIND_SNIPPET);
	}

	public void createNodePatternRuleProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {

		acceptProposal("(NodePatternRuleProposal)", "(node1)", template("(${1}) ${0}"), context, acceptor, true,
				ContentAssistEntry.KIND_SNIPPET);
	}

	public void createPatternPartRuleProposal(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {

		acceptProposal("(PatternPartRuleProposal)", "(node1)", template("(${1}) ${0}"), context, acceptor, true,
				ContentAssistEntry.KIND_SNIPPET);
	}

	public void createPatternElementChainRuleProposal(ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {

		acceptProposal("-[]->", "Outgoing Relation", template("-[${1}]-> ${0}"), context, acceptor, true,
				ContentAssistEntry.KIND_SNIPPET);

		acceptProposal("<-[]-", "Incoming Relation", template("<-[${1}]- ${0}"), context, acceptor, true,
				ContentAssistEntry.KIND_SNIPPET);
	}

	public void createFunctionInvocationRuleProposal(ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {

		graphMetaDataProvider.getFunctions().forEach((key, value) -> {
			acceptProposal(key, value, template(key.substring(0, key.indexOf('('))), context, acceptor, true,
					ContentAssistEntry.KIND_FUNCTION);
		});
	}

	protected void acceptProposal(final String name, final String description, final StringConcatenationClient template,
			final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor,
			final boolean adaptIndentation, final String kind) {

		final ContentAssistEntry entry = this.createProposal(template, context, adaptIndentation);
		boolean _canAcceptProposal = this.canAcceptProposal(entry, context);
		if (_canAcceptProposal) {
			entry.setLabel(name);
			entry.setDescription(description);
			entry.setKind(kind);
			acceptor.accept(entry, this.proposalPriorities.getDefaultPriority(entry));
		}
	}

	private StringConcatenationClient template(final String string) {
		return new StringConcatenationClient() {
			@Override
			protected void appendTo(StringConcatenationClient.TargetStringConcatenation target) {
				target.append(string);
			}
		};
	};

	private void nullSafe(Supplier<List<String>> supplier, Consumer<String> consumer) {
		if (graphMetaDataProvider != null) {
			List<String> list = supplier.get();
			if (list != null) {
				list.forEach(item -> {
					consumer.accept(item);
				});
			}
		}
	}
}