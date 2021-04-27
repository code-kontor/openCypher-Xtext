/*
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
package io.codekontor.opencypher.xtext.ide

import io.codekontor.opencypher.xtext.services.OpenCypherGrammarAccess
import javax.inject.Inject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider

class OpenCypherIdeContentProposalProvider extends IdeContentProposalProvider {

	@Inject extension OpenCypherGrammarAccess

	@Inject OpenCypherTemplateProposalProvider templateProvider

	override dispatch createProposals(RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
				
		// println(ruleCall.rule)
				
		switch ruleCall.rule {
			
			case matchRule: {
				templateProvider.createMatchRuleProposal(context, acceptor)
			}
			case labelNameRule: {
				templateProvider.createLabelNameRuleProposal(context, acceptor)
			}
			case patternPartRule: {
				templateProvider.createPatternPartRuleProposal(context, acceptor)
			}
			case nodePatternRule: {
				templateProvider.createNodePatternRuleProposal(context, acceptor)
			}
			case functionInvocationRule: {
				templateProvider.createFunctionInvocationRuleProposal(context, acceptor)
			}
			case patternElementChainRule: {
				templateProvider.createPatternElementChainRuleProposal(context, acceptor)
			}
			case propertyKeyNameRule: {
				templateProvider.createPropertyKeyNameRuleProposal(context, acceptor)
			}
			case relTypeNameRule: {
				templateProvider.createRelTypeNameRuleProposal(context, acceptor)
			}

			
			default:
				super._createProposals(ruleCall, context, acceptor)	
		}
	}
}
