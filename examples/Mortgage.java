/**
* @author  Freeman
* @version 0.0.1 
* @link https://docs.oracle.com/javase/8/docs/api/
* @since   2015.11.10
*/


import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;


public class Mortgage {

    // Private data members
    private Double rate;
    private Double amount;
    private Double days;
    private Double total;

    // default Constructor
    public Mortgage() {
        this.total = 0.00;
        this.amount = 50000.00;
        this.rate = .0576;
        this.days = (30.00 / 365);
    }

    // Constructor with attibutes
    public Mortgage( double amt, double rate, double days ) {
        this.amount = amt;
        this.rate = (rate/100.00);
        this.days = (days/365.00);
    }

    public double getAmount() {
	return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = Double.parseDouble(amount);
    }

    public void setRate(String rate) {
        this.rate = Double.parseDouble(rate);
    }

    public double getRate() {
        return this.rate;
    }

    public double getDays() {
	return this.days;
    }

    public void setDays(double days) {
	this.days = days/365.00;
    }

    // Method to process mortgage values
    public double processMortgage(double rate, double amt) {
        this.rate = rate;
        this.amount = amt;
        this.total = (this.rate/100.00) * this.amount * this.days;

        return total;
    }

    // Drive of the class
    public static void main(String[] args) throws IOException {

        Mortgage mort = new Mortgage();
	Mortgage mort2 = new Mortgage( 50000, 5.98, 30);
        Scanner scan = new Scanner(System.in);
        String amt = "0", rate = "0";
        double total =0.00;

        System.out.print("Enter in an Amount ?  ");
        amt = scan.nextLine().trim();
			
        if (!amt.matches("^\\d.+$")) {
            System.out.println("Please enter Numbers only ! ");
            System.exit(1);
        }
        mort.setAmount(amt);
        
        System.out.print("Enter in a Rate ?  ");
        rate = scan.nextLine().trim();

        if (!rate.matches("^.+\\d+$")) {
             System.out.println("Please enter Numbers only ! ");
             System.exit(1);
        }
        mort.setRate(rate);

	//total = mort.processMortgage(mort.getRate(), mort.getAmount());
	total = mort2.processMortgage(mort.getRate(), mort.getAmount());
        System.out.println("Your monthly interests on your mortgage is: " + total);

    }
}
