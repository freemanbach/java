/**
* @author  Freeman
* @version 0.0.1 
* @link https://docs.oracle.com/javase/8/docs/api/
* @since   2018-11-25
*/

// Java Libraries
import java.io.*;
import java.util.*;


// class Sample2
public class Sample2{
	
	// These are different than of the set from below
	int x = 0;                                 // primative data type int
	float y = 3.14f;                           // primitive data type float
	double z = 0.00;                           // primitive data type double
	int m=0,n=0,o=0;                           // primitive data type int different form
	
	// These are different from the set from above
	Integer a = new Integer("23");             // integer object
	Float b = new Float("23.33");              // float object
	Double c = new Double("23.333333333");     // Double object
	String st = new String("Hello World.");    // String object
	
	// function prtWhileLoop returns nothing
	public void prtWhileLoop() {
		int a =0;
		while ( a < 10) {
			System.out.println("Your values are: " + a + " in while loop.");
			a=a+1;
		}
	}
	
	// function prtForLoop returns nothing
	public void prtForLoop() {
		for ( int a=0; a < 10; a++) {
			System.out.println("Your values are: " + a + " in for loop.");
		}
	}
	
	// function takeInParameter returns int 
	public int takeInParameter(int x, int y) {
		int total = 0;
		total = x + y;
		return total;
	}

	// function testArray() returns nothing
	public void testArray1() {
		// String array
		String[] fruits = new String[] { "Orange", "Apple", "Pear", "Strawberry" };
		// print out the array in a foreach loop
		for (String f : fruits) {
			System.out.println("Your items are: " + f + " fruit.");
		}		
	}

	public void testArrayLists() {
		Random rand = new Random();
		// Array List with String obj
		ArrayList <String> sArrList = new ArrayList <String>();
		String mess = "";
		sArrList.add("Cheese");
		sArrList.add("Cake");
		sArrList.add("ist");
		sArrList.add("Awosome");
		for ( int a=0; a<sArrList.size(); a++) {
			mess += sArrList.get(a) + " ";
		}
		System.out.println(mess);

		// Array List with Integer obj
		ArrayList <Integer> iArrList= new ArrayList <Integer>();
		for ( int y = 0; y<10; y++) {	
			iArrList.add(rand.nextInt(100));
		}
		for (int x=0; x<10; x++) {
			System.out.println(iArrList.get(x).toString());
		}
	}

	// main driver class
	public static void main(String [] args) throws IOException {
		
		// Creating a class object
		Sample2 mx = new Sample2();
		// Calling the functions/methods
		mx.prtWhileLoop();
		mx.prtForLoop();
		// local variables
		int a = 9; int b =10;
		int sum = 0;
		// method testing with parameters and printing out solutions
		sum = mx.takeInParameter(a,b);
		System.out.println("your answer using this function ist: " + sum);
		
		// array testing
		mx.testArray1();
		// Array List
		mx.testArrayLists();
	}
}
