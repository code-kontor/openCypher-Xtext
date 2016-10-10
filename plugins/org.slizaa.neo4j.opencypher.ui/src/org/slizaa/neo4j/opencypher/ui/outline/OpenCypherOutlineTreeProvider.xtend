/*
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.opencypher.ui.outline

import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.slizaa.neo4j.opencypher.openCypher.Cypher
import org.slizaa.neo4j.opencypher.openCypher.SingleQuery
import org.slizaa.neo4j.opencypher.openCypher.Statement

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class OpenCypherOutlineTreeProvider extends DefaultOutlineTreeProvider {

	def void _createChildren(DocumentRootNode parentNode, Cypher cypher) {

		for (element : EcoreUtil2.getAllContentsOfType(cypher, Statement)) {

			if (element instanceof SingleQuery) {
				val SingleQuery singleQuery = element as SingleQuery;
				if (singleQuery.union.size > 0) {
// TODO			
//			createNode(parentNode, singleQuery);
//			val IOutlineNode singleQueryParent = NodeModelUtils.getNode(singleQuery);
//			for (clause : singleQuery.clauses) {
//				createNode(singleQueryParent, clause);
//			}
				} else {
					for (clause : singleQuery.clauses) {
						createNode(parentNode, clause);
					}
				}
			} else {
				createNode(parentNode, element);
			}
		}
	}

	def void _createChildren(DocumentRootNode parentNode, SingleQuery singleQuery) {

		//
		if (singleQuery.clauses.size > 1) {
// TODO			
//			createNode(parentNode, singleQuery);
//			val IOutlineNode singleQueryParent = NodeModelUtils.getNode(singleQuery);
//			for (clause : singleQuery.clauses) {
//				createNode(singleQueryParent, clause);
//			}
		} else {
			for (clause : singleQuery.clauses) {
				createNode(parentNode, clause);
			}
		}
	}
}