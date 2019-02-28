/**
 * 
 */
package GroupProject.Spring2;

/**
 * @author KeenanJones
 *
 */
public class Defaults {
	String name;
	int maxChildren;
	String plan;
	int position;
	
	
	/**
	 * @param name
	 * @param maxChildren
	 * @param plan
	 */
	public Defaults(String name, int maxChildren, String plan, int position) {
		super();
		this.name = name;
		this.maxChildren = maxChildren;
		this.plan = plan;
		this.position = position;
	}
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
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
	 * @return the maxChildren
	 */
	public int getMaxChildren() {
		return maxChildren;
	}
	/**
	 * @param maxChildren the maxChildren to set
	 */
	public void setMaxChildren(int maxChildren) {
		this.maxChildren = maxChildren;
	}
	/**
	 * @return the plan
	 */
	public String getPlan() {
		return plan;
	}
	/**
	 * @param plan the plan to set
	 */
	public void setPlan(String plan) {
		this.plan = plan;
	}

	

	
}
