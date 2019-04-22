/**  
 *
 * @author Freeman
 * @version 0.0.1 
 * @date 2019.04.21
 * @vim set tabstop=4
 *
 */


public class Cow extends Animal {

	// Cow Data members
	private double hoofsize;
	private boolean nosering;
	private String lang;

	// Generic Cow
	public Cow () {
		this.hoofsize = 15.6;
		this.nosering = true;
		this.lang = "MOO";
	}
	
	// Special Cow
	public Cow ( double food, String name, String type, double water, double weight, double height, double hoofsize, boolean nosering, String lang ) {
		super( food, name, type, water, weight, height );
		this.hoofsize = hoofsize;
		this.nosering = nosering;
		this.lang = lang;
	}
	
	public double getHoofSize() {
		return this.hoofsize;
	}

	public boolean getNoseRing() {
		return this.nosering;
	}

	public boolean eatGrass() {
		return true;
	}

	public String getSpeakLang() {
		return this.lang;
	}

	public void setHoofSize(double hs) {
		this.hoofsize = hs;
	}

	public void setNoseRight(boolean nr) {
		this.nosering = nr;
	}

	public void setLanguage(String l) {
		this.lang = l;
	}

	// some sort of poly-morphing cow
	public boolean canSpeak() {

		if ( super.getType().toLowerCase().equals( new String("angus")) ) {
			return true;
		}

		return super.canSpeak();
	}

    public String toString() {
		return "HOBBIT";
    }
}
