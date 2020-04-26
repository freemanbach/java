/**  
 *
 * @author Freeman
 * @version 0.0.1 
 * @date 2018.11.24
 * @vim set tabstop=4
 *
 */

import java.io.*;
import java.util.Scanner;

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


public class Sample3 {
	public static void main(String[] args) throws IOHobbitException {
		
		String fn = "data.txt";

		try {
			Scanner sc = new Scanner(new File(fn)); 

			if ( sc.hasNextLine() ) {
				System.out.println(sc.nextLine());
			}
			else {
				throw new IOHobbitException("Nothing is there");
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (IOHobbitException e) {
			System.out.println(e.getMessage());
		}
	}
}
