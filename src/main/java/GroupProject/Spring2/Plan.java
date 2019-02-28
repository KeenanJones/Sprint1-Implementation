package GroupProject.Spring2;

import java.util.ArrayList;

public abstract class Plan {
	
	Node pointer;
	
	
	//Constructor
	public Plan() {
		
	}
	
	//This method makes the arraylist of default nodes for the plan
	public ArrayList<Defaults> makeDefaultNodeObjects(String[] defaultN, Integer[] defaultL, String planN) {
		ArrayList<Defaults> Objects = new ArrayList<Defaults>();
		
		for(int i=0; i<defaultN.length; i++) {
			Defaults node = new Defaults(defaultN[i], defaultL[i], planN, i);
			Objects.add(node);
		}
		return Objects;
		
	}
	
	//This builds the rest of the tree from a parent
	public void buildChildren(Node parent, ArrayList<Node> noChildren, ArrayList<String> defaultNodesToPass, Integer position) {
		for(int i=position; i<defaultNodesToPass.size(); i++) {
			Node nodeMade = new Node(defaultNodesToPass.get(i), null, noChildren, parent, i);
			
			System.out.println("Made a "+ defaultNodesToPass.get(i));
			
			parent.addChild(parent, nodeMade);
			parent = nodeMade;
		
		}
	}
	
	
	
	
	//This adds a node to the node passed as an argument
	public void addNode(Node parent, ArrayList<String> defaultNodesToPass) {
		
		Integer position = parent.getPosition();
		ArrayList<Node> noChildren = new ArrayList<Node>();
		buildChildren(parent, noChildren , defaultNodesToPass, position);
		
	}
	
	
	//This removes the passed node and all its children
	public void removeNode(Node node) {
		Node parent = node.getParent();
		ArrayList<Node> children = parent.getChildren();
		children.remove(node);
		parent.setChildren(children);
	}
	
	//This sets the data inside of a current node
	public void setNodeData(Node node, String data) {
		node.setData(data);
	}
	
	//gets the point
	public Node getPointer() {
		return pointer;
	}

	public ArrayList<String> getDefaultNodesToPass() {
		// TODO Auto-generated method stub
		return getDefaultNodesToPass();
	}
}
