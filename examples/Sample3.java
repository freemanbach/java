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

	public void prtReadError() {
		System.out.println("not able to read file");
	}
}


public class Sample3 {
	public static void main(String[] args) throws IOHobbitException, Exception {
		
		String rl = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			rl = br.readLine();
			System.out.println(rl);
		}
		catch (IOHobbitException e) {
			e.prtReadError();
			//e.getMessage();
		}
	}
}
