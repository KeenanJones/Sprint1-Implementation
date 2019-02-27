package GroupProject.Spring2;

public abstract class Plan {
	
	Node pointer;
	String defaultNodes[];
	
	//Constructor
	public Plan() {
		
	}
	
	//This adds a node to the node passed as an argument
	abstract void addNode(Node node);
	
	//This removes the passed node and all its children
	abstract void removeNode(Node node);
	
	//This sets the data inside of a current node
	abstract void setNodeData(Node node, String data);
	


	public static void main(String[] args) {
		Plan test = new Centre();
		System.out.println(test);
		

	}

}
