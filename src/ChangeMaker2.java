//Daniel Peterson (109091561)
//This program calculates the number of each coin or bill to return
//a user determined value of change
import java.util.Scanner;

public class ChangeMaker2 {
	public static void main(String[] args){
		int change, rem, qs, ds, ns, ps, twnty, ten, five, dlr;
		double price, tender;
		System.out.println("Input price: ");
		Scanner input = new Scanner(System.in);
		price = input.nextDouble();
		price = price * 100;
		System.out.println("Input amount paid: ");
		Scanner input1 = new Scanner(System.in);
		tender = input1.nextDouble();
		tender = tender * 100;
		change = (int)(tender - price);
		twnty = change / 2000;
		rem = change % 2000;
		ten = rem / 1000;
		rem = rem % 1000;
		five = rem / 500;
		rem = rem % 500;
		dlr = rem / 100;
		rem = rem % 100;
		qs = rem / 25;
		rem = rem % 25;
		ds = rem / 10;
		rem = rem % 10;
		ns = rem / 5;
		rem = rem % 5;
		ps = rem;
		System.out.print(twnty + " $20 bills, " + ten + " $10 bills, ");
		System.out.print(five + " $5 bills, " + dlr + " $1 bills, ");
		System.out.print(qs + " quarters, " + ds + " dimes, ");
		System.out.println(ns + " nickels, " + ps + " pennies");
	}
}
