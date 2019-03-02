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
	
	static ArrayList<Plan> plans = new ArrayList<Plan>();
	ArrayList<String> templates;
	
	//This generates the list of possible templates that can be made
	public void generateTemplateList() {
		ArrayList<String> templates = new ArrayList<String>();
		templates.add("Centre");
		templates.add("VMOSA");
		templates.add("IowaState");
		
	}
	
	//This makes a plan based on what string is passed to it 
	public static Plan getPlan(String plan) {
		
		if(plan == "Centre") {
			Plan newPlan = new Centre();
			plans.add(newPlan);
			return newPlan;
		}
		else if(plan == "VMOSA") {
			Plan newPlan = new VMOSA();
			plans.add(newPlan);
			return newPlan;
		}
		else if(plan == "IowaState") {
			Plan newPlan = new IowaState();
			plans.add(newPlan);
			return newPlan;
		}
		else {
			System.out.println("This plan is not currently available.");
			return null;
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
//		Plan newestPlan = getPlan("Centre");
		
		
		
//		ArrayList<String> defaultNodesToPass = newestPlan.getDefaultNodesToPass();
//		newestPlan.addNode(newestPlan.getPointer().getChildren().get(1), defaultNodesToPass);
//		
//		newestPlan.removeNode(newestPlan.getPointer().getChildren().get(2));
//		
//		newestPlan.getPointer().setData("This is some new data, beleive it or not");
//		System.out.println(newestPlan.getPointer().getData());
		
		
		getPlan("Centre");
		getPlan("Centre");
		getPlan("VMOSA");
		getPlan("Dog");
		getPlan("IowaState");
		getPlan("VMOSA");
		
		for(int i=0; i<plans.size();i++) {
			System.out.println(plans.get(i));
		}
		
		
		

	}

}

