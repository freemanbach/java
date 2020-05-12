import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Author  : flo
 * Date    : 2020.05.11
 * Purpose : Example of a OO model of  Lottery Ticket with Threading
 *         : Somethign i could reference for multi-threading using simple example
 * version : 0.0.2
 */


public class Lotto_T {

    private ArrayList <Integer> myarr;
    private Random rand;

    public Lotto_T() {
        myarr = new ArrayList<Integer>();
        rand = new Random();
    }

    public synchronized void additemstolist(int size) {

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


    public static void main(String[] args) throws IOException, InterruptedException {

        final Lotto_T lotto = new Lotto_T();

        class CountingThread extends Thread {
            public void  run() {
                for (int x = 0; x < 10; x++) {   // 10
                    lotto.additemstolist(1);     // 1X multiplier
                }
            }
        }
        
        CountingThread t1 = new CountingThread(); // prints 10 times
        CountingThread t2 = new CountingThread(); // prints 10 times

        t1.start();t2.start();
        t1.join();t2.join();
    }
}
