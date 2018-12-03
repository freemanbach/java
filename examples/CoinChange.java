/**  
 *
 * @author Freeman
 * @version 0.0.1 
 * @date 2018.12.02
 * @vim set tabstop=4
 *
 */

import java.util.*;
import java.lang.*;
import java.io.*;


public class CoinChange{
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		Double value = 0.00, tmp=0.00;
		int q=0,d=0,n=0,p=0;
		double cnt = 0.00;
		System.out.print("Enter in a change value? ");
		value = scan.nextDouble();
		tmp = (value / .25);
		q = tmp.intValue();
		cnt = value - ( q * .25);
		tmp = cnt / .10;
		d = tmp.intValue();
		cnt = cnt - ( d * .10);
		tmp = cnt / .05;
		n = tmp.intValue();
		cnt = cnt - ( n * .05);
		tmp = (double)Math.round(cnt / .01);
		p = tmp.intValue();
		
		System.out.println("Quarters: " + q);
		System.out.println("Dimes   : " + d);
		System.out.println("Nickels : " + n);
		System.out.println("Pennies : " + p);
		
		System.exit(0);
	}
}
