import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Author  : flo
 * Date    : 2020.05.11
 * Purpose : Example of a OO model of  Lottery Ticket
 * version : 0.0.2
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

    public static void main(String[] args) throws IOException {

        Lotto ticket = new Lotto();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter in the number of Tickets ? ");
        int z = Integer.parseInt(scan.next());
        ticket.additemstolist(z);
    }
}
