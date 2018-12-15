/**  
 *
 * @author Freeman
 * @version 0.0.1 
 * @date 2018.12.14
 * @vim set tabstop=4
 *
 */


public class Animal {

	private double food; // numeric
	private String name; // string
	private String type; // string
	private double water; // numeric
	private double weight;  // numeric

	public Animal() {
		this.food = 0.00;
		this.name = "";
		this.type = "";
		this.water = 0.00;
		this.weight = 0.00;
	}

	public Animal(double food, String name, String type, double water, double weight) {
		this.food = food;
		this.name = name;
		this.type = type;
		this.water = water;
		this.weight = weight;
	}

	public double getFood() {
		return this.food;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.type;
	}

	public double getWater() {
		return this.water;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setFood(double food) {
		this.food = food;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setWater(double water) {
		this.water = water;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isMammal() {
        return true;
    }

	public boolean canSpeak() {
		return false;
	}
}
