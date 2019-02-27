package GroupProject.Spring2;

public class Centre extends Plan{
	String defaultNodes[] = {"Mission", "Goals", "Objectives", "Assessment Process", "Results"};
	
	//This is the pointer to the first node in the tree
	Node pointer;
	
	public Centre() {
		pointer = new Node(defaultNodes[0], null, null, null);
		System.out.println(this.defaultNodes[0]);
		
		//Create the rest of the default tree
		addNode(pointer);
		
			
	}
	
	@Override
	void addNode(Node node) {
		String name = node.getName();
		int position = 0;
		
		//return the spot in the default list in which this wants to add a new node to
		for(int i = 0; i < defaultNodes.length; i++) {
			if(defaultNodes[i] == name) {
				if(i < defaultNodes.length) {
					position = i + 1;	
				}
				else {
					System.out.println("Cannot add a node here.");
				}
			}
		}
		
		Node parent = node;
		for(int j = 0; j < (defaultNodes.length - position); j++) {
			Node newNode = Node(defaultNodes[position], null, null, parent);
			
			parent.addChild(newNode);
			System.out.println("added a child ");
			
			parent = newNode;
			position++;
		}
		
		System.out.println();
		
	}

	private Node Node(String string, Object object, Object object2, Node parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void removeNode(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void setNodeData(Node node, String data) {
		// TODO Auto-generated method stub
		
	}

	
}
