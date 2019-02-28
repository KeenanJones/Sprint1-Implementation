/**
 * 
 */
package GroupProject.Spring2;

import java.util.ArrayList;

/**
 * @author KeenanJones
 *
 */
public class Template {

	/**
	 * @param args
	 */
	
	Plan plans[];
	String templates[];
	
	
	
	public static void main(String[] args) {
		Plan test = new Centre();		
		
		ArrayList<String> defaultNodesToPass = test.getDefaultNodesToPass();
		test.addNode(test.getPointer().getChildren().get(1), defaultNodesToPass);
		
		test.removeNode(test.getPointer().getChildren().get(2));
		
		test.getPointer().setData("Hallie is cute... like reallyyyy cute. Like she should probably kiss me right now");
		System.out.println(test.getPointer().getData());
		
		
		

	}

}

