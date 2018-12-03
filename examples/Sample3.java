/**  
 *
 * @author Freeman
 * @version 0.0.1 
 * @date 2018.11.24
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


public class Sample3 {
	public static void main(String[] args) throws IOHobbitException {
		
		String fn = "data.txt";
		File f1 = new File(fn); 

		try {
			 Scanner sc = new Scanner(new File(fn)); 

			if ( sc.hasNextLine() ) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
