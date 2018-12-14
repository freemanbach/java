/**  
 *
 * @author Freeman
 * @version 0.0.1 
 * @date 2018.12.14
 * @vim set tabstop=4
 * @description java Sample5 hello planet
 *
 */

import java.util.*;
import java.lang.*;

class IOHobbitException extends Exception {
        // it is simply comical to own a IOHobbitException class in this java class.
        public IOHobbitException() {

        }

        public void prtSomething() {
            System.out.println(" Place holder exception " );
        }
}

public class Sample5 {
        public static void main(String[] args) throws IOHobbitException {

        int size = args.length;
        if (size == 0) {
            System.out.println("Too few parameters !");
        }
        else if (size == 1) {
            System.out.println("Too few peremeters.");
        } 
        else if (size == 2) {
            System.out.print(args[0].toString() + " ");
            System.out.print(args[1].toString());
            System.out.println();
        }
        else {
            System.out.println("TOo many Parameters");
        }
		
        System.exit(0);
    }
}
