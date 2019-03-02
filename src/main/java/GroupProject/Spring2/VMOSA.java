package GroupProject.Spring2;

import java.util.ArrayList;

public class VMOSA extends Plan{
	//Sets a string array of all the parts of its business plan
	String defaultNodes[] = {"Vision", "Mission", "Objectives", "Strategies", "Action Plans"};
	Integer defaultLimits[] = {1, 1, 15, 15, 15};
	String planName = "VMOSA";
	
	ArrayList<Defaults> defaultObjects = makeDefaultNodeObjects(defaultNodes, defaultLimits, planName);
	
	//This is the pointer to the first node in the tree
	Node pointer;
	
	
	
	
	public VMOSA() {
		ArrayList<String> defaultNodesToPass = getDefaultNodesToPass();
		
		ArrayList<Node> noChildren = new ArrayList<Node>();
		pointer = new Node("Vision", null, noChildren, null, 0);
		Node parent = pointer;
		
		buildChildren(parent, noChildren, defaultNodesToPass, 1);

		
			
	}




	/**
	 * @return the pointer
	 */
	public Node getPointer() {
		return pointer;
	}

	//makes an array list of the default nodes for passing purposes
	public ArrayList<String> getDefaultNodesToPass(){
		ArrayList<String> defaultNodesToPass = new ArrayList<String>();
		
		for(int i = 0; i < defaultNodes.length; i++) {
			defaultNodesToPass.add(defaultNodes[i]);
		}
		
		return defaultNodesToPass;
		
	}



	/**
	 * @param pointer the pointer to set
	 */
	public void setPointer(Node pointer) {
		this.pointer = pointer;
	}









		
}
