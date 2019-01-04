package io.codekontor.opencypher.xtext.ui.highlighting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage;
import io.codekontor.opencypher.xtext.openCypher.RelationshipTypes;
import io.codekontor.opencypher.xtext.openCypher.StringLiteral;
import io.codekontor.opencypher.xtext.openCypher.VariableDeclaration;
import io.codekontor.opencypher.xtext.openCypher.VariableRef;
import io.codekontor.opencypher.xtext.services.OpenCypherGrammarAccess;

import com.google.inject.Inject;

public class OpenCypherSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {

  @Inject
  OpenCypherGrammarAccess ga;

  @Override
  protected void doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
      CancelIndicator cancelIndicator) {

    EObject rootObject = resource.getParseResult().getRootASTElement();

    //
    for (VariableDeclaration variable : EcoreUtil2.getAllContentsOfType(rootObject, VariableDeclaration.class)) {
      for (INode node : NodeModelUtils.findNodesForFeature(variable,
          OpenCypherPackage.eINSTANCE.getVariableDeclaration_Name())) {
        acceptor.addPosition(node.getOffset(), node.getLength(), OpenCypherHighlightingConfiguration.VARIABLE_ID);
      }
    }

    //
    for (VariableRef variableRef : EcoreUtil2.getAllContentsOfType(rootObject, VariableRef.class)) {
      for (INode node : NodeModelUtils.findNodesForFeature(variableRef,
          OpenCypherPackage.eINSTANCE.getVariableRef_VariableRef())) {
        acceptor.addPosition(node.getOffset(), node.getLength(), OpenCypherHighlightingConfiguration.VARIABLE_REF_ID);
      }
    }

    //
    for (StringLiteral stringConstant : EcoreUtil2.getAllContentsOfType(rootObject, StringLiteral.class)) {
      for (INode node : NodeModelUtils.findNodesForFeature(stringConstant,
          OpenCypherPackage.eINSTANCE.getStringLiteral_Value())) {
        acceptor.addPosition(node.getOffset(), node.getLength(), OpenCypherHighlightingConfiguration.STRING_ID);
      }
    }

    //
    for (RelationshipTypes relTypes : EcoreUtil2.getAllContentsOfType(rootObject, RelationshipTypes.class)) {
      for (INode node : NodeModelUtils.findNodesForFeature(relTypes,
          OpenCypherPackage.eINSTANCE.getRelationshipTypes_RelTypeNames())) {
        acceptor.addPosition(node.getOffset(), node.getLength(),
            OpenCypherHighlightingConfiguration.RELATIONSHIP_TYPES_ID);
      }
    }

    //
    super.doProvideHighlightingFor(resource, acceptor, cancelIndicator);
  }
}
