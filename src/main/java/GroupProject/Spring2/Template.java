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
	
	
	public static Plan getPlan(String plan) {
		
		
		if(plan == "Centre") {
			Plan newPlan = new Centre();
			return newPlan;
		}
		else if(plan == "VMOSA") {
			Plan newPlan = new VMOSA();
			return newPlan;
		}
		else if(plan == "IowaState") {
			Plan newPlan = new IowaState();
			return newPlan;
		}
		else {
			System.out.println("This plan is not currently available.");
			return null;
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		Plan newestPlan = getPlan("Centre");
		
		
		ArrayList<String> defaultNodesToPass = newestPlan.getDefaultNodesToPass();
		newestPlan.addNode(newestPlan.getPointer().getChildren().get(1), defaultNodesToPass);
		
		newestPlan.removeNode(newestPlan.getPointer().getChildren().get(2));
		
		newestPlan.getPointer().setData("This is some new data, beleive it or not");
		System.out.println(newestPlan.getPointer().getData());
		
		
		

	}

}

