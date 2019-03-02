package GroupProject.Spring2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Test2 {

	@Test
	public void testAddNode() {
		//Generate a Centre plan
		Plan newPlan = new Centre();
		ArrayList<String> toPass = newPlan.getDefaultNodesToPass();
		Node goalsNode = newPlan.getPointer().getChildren().get(0);
		
		//This plan should have 5 nodes to start
		//I am going to add a "Objectives" node and it should also add "Assessment Process" and "Results"
		//So goals should have 2 kids now
		newPlan.addNode(goalsNode, toPass);
		
		assertEquals("Objectives", goalsNode.getChildren().get(1).getName());
		
	}

	@Test
	public void testRemoveNode() {
		//Generate a Centre plan
		Plan newPlan1 = new Centre();
		ArrayList<String> toPass = newPlan1.getDefaultNodesToPass();
		Node goalsNode = newPlan1.getPointer().getChildren().get(0);
		
		//Removes this node
		newPlan1.removeNode(goalsNode);
		
		//Now there should only be the mission node left in this tree
		Node missionNode = newPlan1.getPointer();
		assertEquals("Null", missionNode.getChildren().get(0).getName());
	}

	@Test
	public void testSetNodeData() {
		fail("Not yet implemented");
	}

}
