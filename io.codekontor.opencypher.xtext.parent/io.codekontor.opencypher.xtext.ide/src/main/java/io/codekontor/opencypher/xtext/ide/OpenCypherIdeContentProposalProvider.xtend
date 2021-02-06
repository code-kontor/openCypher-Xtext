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
				
		println(ruleCall.rule)
				
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
