import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Author  : flo
 * Date    : 2020.05.10
 * Purpose : Example of a OO model of  Lottery Ticket
 * version : 0.0.5
 */

public class Lotto {

    private ArrayList <Integer> myarr;
    private Random rand;

    public Lotto() {
        myarr = new ArrayList<Integer>();
        rand = new Random();
    }

    public void additemstolist(int size) {

        int tmp =0;
        for ( int a=0; a < size; a++) {
            this.myarr = new ArrayList <Integer> ();
            for (int c=0; c<6; c++){
                if (c==5) {
                    tmp = genmagicnum();
                    this.myarr.add(tmp);
                }
                else {
                    tmp = genrandnum();
                    this.myarr.add(tmp);
                }
            }
            System.out.println(this.myarr);
        }
    }

    public int genrandnum(){
        return this.rand.nextInt(70)+1;
    }

    public int genmagicnum(){
        return this.rand.nextInt(25)+1;
    }

    public int getinput(String data) {

        if (!isnumeric(data)) {
            System.out.println("User input is not of integer value. ");
            System.out.println("Exiting............................ ");
            System.exit(1);
        } else if (isnumeric(data)) {
            return Integer.parseInt(data);
        }
        return 0;
    }

    public static boolean isnumeric(String str) {

        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static void main(String[] args) throws IOException {

        String mess = "";
        Lotto ticket = new Lotto();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter in the number of Tickets or 'q' to quit ? ");
            int z = ticket.getinput(scan.next());
            ticket.additemstolist(z);
            System.out.print("Try again? y/n: ");
            mess = scan.next();
        } while (mess.equalsIgnoreCase("y"));
    }
}
