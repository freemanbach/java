/**  
 *
 * @author Freeman
 * @version 0.0.1 
 * @date 2018.12.13
 * @vim set tabstop=4
 *
 */


import java.io.*;
import java.util.*;


class IOHobbitException extends Exception {

	public IOHobbitException() {
	}

	public IOHobbitException(String em) {
		System.out.println(em);
	}

	public void prtReadError(String em) {
		System.out.println(em);
	}
	public void prtWriteError(String em) {
		System.out.println(em);
	}
}


public class Sample4 {

	public static void main(String[] args) throws IOHobbitException {
		
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("Enter an integer: "); 

        int a = 0; String b = "";
        try {
            a = Integer.parseInt(read.readLine()); 
        }
        catch (IOException ex) {
            System.out.println("The item you entered was not a number:" + ex.getMessage() ); 
        }

        System.out.print("Enter a string? "); 
        try {
            b = read.readLine();
        }
        catch (IOException ex) {
            System.out.println("Check your input, must be a string: " + ex.getMessage());
        }

        System.out.println("Your inputs are: " + a + " " + b);
        System.out.println("\n");

        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter in a string? ");
	String c = sc.nextLine();
        System.out.print("Enter in a Float number? ");
        float d = Float.parseFloat(sc.nextLine());
        System.out.println("your outputs are: " + c + " " + d);
	
	}
}
