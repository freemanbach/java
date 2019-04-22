/**  
 *
 * @author Freeman
 * @version 0.0.1 
 * @date 2019.04.21
 * @vim set tabstop=4
 *
 */


class IOCowException extends Exception {
	// Custom Cow Exception class
	public IOCowException() {
		// not decided what to do here
	}
}


public class Driver {
	
	public static void main(String [] args) throws IOCowException {

		// LEGEND of the Cow 
		// float food, String name, String type, double water, double weight,double height, float hoofsize, boolean nosering, String lang
		Cow koffie = new Cow(5.67, "Koffie", "Angus", 15.5, 896.5, 13.56, 2.89, true, "moo");
		Cow dana = new Cow(6.67, "dana", "Jersey Cattle", 14.5, 996.5, 18.56, 3.19, false, "na");
		System.out.println("Mammal: " + koffie.isMammal());
		System.out.println(dana.getName() + " can Speak: " + dana.canSpeak());
		System.out.println(koffie.getName() + " can Speak: " + koffie.canSpeak());
		System.out.println("Koffie Type: " + koffie.getType());
		System.out.println("Dana Type: " + dana.getType());
   
	}
}
