package io.codekontor.opencypher.xtext.tests.expression

import io.codekontor.opencypher.xtext.tests.AbstractCypherTest
import org.junit.Test

class Expression_Case_Test extends AbstractCypherTest {

	@Test
	def void caseTest_0_withCaseExpression() {
		test('''
			MATCH (n)
			RETURN
			CASE n.eyes
			WHEN 'blue'
			THEN 1
			WHEN 'brown'
			THEN 2
			ELSE 3 END AS result
		''');
	}

	@Test
	def void caseTest_0_withoutCaseExpression() {
		test('''
			MATCH (n)
			RETURN
			CASE
			WHEN 'blue'
			THEN 1
			WHEN 'brown'
			THEN 2
			ELSE 3 END AS result
		''');
	}

	@Test
	def void caseTest_1() {
		test('''
			START team = node:node_auto_index('name:\'Chelsea\' name:\'Manchester United\''), 
			      startDate = node:node_auto_index(name='2nd') 
			MATCH (startDate)<-[:NEXT*0..]-(day) 
			WITH team, startDate, COLLECT(day) AS dates 
			MATCH (startDate)<-[:NEXT*0..]-(day)<-[hire:HIRED_ON]-(tenure)-[:MANAGER]->(manager), 
			      (tenure)-[:TEAM]->(team), 
			      (tenure)-[?:FIRED_ON]->(dateFired) 
			RETURN team.name,    
			       CASE WHEN dateFired is null THEN manager.name 
			            WHEN dateFired IN dates THEN null 
			            ELSE manager.name END as managerName,       
			       CASE WHEN dateFired is null THEN hire.date 
			            WHEN dateFired IN dates THEN null 
			            ELSE hire.date END as hireDate
		''');
	}

}
