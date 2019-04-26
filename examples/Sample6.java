/**
* @author  Freeman
* @version 0.0.1 
* @link https://docs.oracle.com/javase/8/docs/api/
* @since   2019.04.26
*/

// Java Libraries
import java.util.Scanner;
import java.io.IOException;


// class Sample6
public class Sample6{

	public Sample6() {

	}

	public long computeOneLess(long i) {

		if ( i == 1 ) {
			return 1;

		} else {
			System.out.println("Your num ist: " + i);
			return computeOneLess(i-1);
		}
	}
	
	public static void main(String [] args) throws IOException {

		Sample6 sam = new Sample6();

		try {
			System.out.println("Your num ist: " + sam.computeOneLess(10));
			// Uncomment this line and comment out the above line, it will have interesting results
			// System.out.println(sam.computeOneLess(-9));
		} 
		catch (StackOverflowError err){
			System.out.println("Caught this malevalent system memory overflow error.");
			// err.printStackTrace();
			System.out.println("Mr. Anderson, you have clone yourself too many times !");
		}
	}
}
