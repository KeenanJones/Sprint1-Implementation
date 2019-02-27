package GroupProject.Spring2;

import java.util.ArrayList;


//This is the node class that holds the information of all of the nodes in the tree
@SuppressWarnings("unused")
public class Node {
	String name;
	String data;
	Node children[];
	Node parent;
	
	/**
	 * @param name
	 * @param data
	 * @param children
	 * @param parent
	 */
	public Node(String name, String data, Node[] children, Node parent) {
		super();
		this.name = name;
		this.data = data;
		this.children = children;
		this.parent = parent;
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
	public Node[] getChildren() {
		return children;
	}
	
	/**
	 * @param children the children to set
	 */
	public void setChildren(Node[] children) {
		this.children = children;
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
	public void addChild(Node node) {
		this.children[0] = node;
		
	}
	
	//Removes a child and the rest branch
	public void removeChild(Node node) {
		
	}

}
