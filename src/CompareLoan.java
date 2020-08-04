//Daniel Peterson (109091561)
//This program receives a user-determined loan
//amount and displays the monthly interest rate
import java.util.Scanner;

public class CompareLoan {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double payment, loan, interest = 5.00, total;
		int years, i;
		System.out.println("Enter a loan amount: ");
		loan = input.nextDouble();
		System.out.println("Enter a number of years ");
		years = input.nextInt();
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment\n");
		for(i=0; i < 25; i++){
			interest = interest / 100.00;
			double interest1 = interest / 12.00;
			//payment = loan * interest / (1 - 1 / Math.pow((1 + interest), years * 12));
			//payment = loan * interest / (1 - 1 / Math.pow(1 + interest, years * 12));
			payment = loan * (interest1 / (1 - (Math.pow((1 + interest1), (-1 * 12 * years)))));
			total = payment * years * 12;
			interest = interest * 100.00;
			double interestdisp = (int)(interest * 1000) / 1000.00;
			double paymentdisp = (int)(payment * 100) / 100.00;
			double totaldisp = (int)(total * 100) / 100.00;
			System.out.print(interestdisp + "%\t" + paymentdisp + "\t" + totaldisp + "\n");
			interest = interest + 0.125;
		}
	}
}
