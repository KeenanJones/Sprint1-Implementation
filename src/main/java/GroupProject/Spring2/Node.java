package GroupProject.Spring2;

import java.util.ArrayList;


//This is the node class that holds the information of all of the nodes in the tree
public class Node {
	String name;
	String data;
	ArrayList<Node> children;
	Node parent;
	Integer position;
	
	/**
	 * @param name
	 * @param data
	 * @param children
	 * @param parent
	 */
	public Node(String name, String data, ArrayList<Node> children, Node parent, Integer position) {
		super();
		this.name = name;
		this.data = data;
		this.children = children;
		this.parent = parent;
		this.position = position;
	}
	

	/**
	 * @return the position
	 */
	public Integer getPosition() {
		return position;
	}


	/**
	 * @param position the position to set
	 */
	public void setPosition(Integer position) {
		this.position = position;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	
	/**
	 * @return the children
	 */
	public ArrayList<Node> getChildren() {
		return children;
	}
	
	/**
	 * @param children the children to set
	 */
	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}
	
	public void setChildrenEmpty() {
		ArrayList<Node> noChildren = new ArrayList<Node>();
		this.children = noChildren;
	}
	
	/**
	 * @return the parent
	 */
	public Node getParent() {
		return parent;
	}
	
	/**
	 * @param parent the parent to set
	 */
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	//Adds a child to the given node
	public void addChild(Node parent, Node newNode) {
		ArrayList<Node> newChildren = parent.getChildren();
		newChildren.add(newNode);
		parent.setChildren(newChildren);
		
		
	}
	

	




}
