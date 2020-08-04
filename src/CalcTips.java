//Daniel Peterson (109091561)
//This program receives a user defined value for a bill and
//then calculates the tip for biil
import java.util.Scanner;

public class CalcTips {
	public static void main(String[] args){
		double tip, bill, temp;
		System.out.println("Input the price of the bill: ");
		Scanner input = new Scanner(System.in);
		bill = input.nextDouble();
		if(bill <= 29.99){
			tip = 5.00;
			//temp = tip / 100;
			//temp = bill * temp;
			bill = bill + tip;
			bill = (int)(bill * 100) / 100.00;
			//bill = (int)((bill * 100) / 100.00);
			//tip = (int)((tip * 100) / 100.00);
		//	System.out.print("The gratuity is: $" + tip + " and the total is $" + bill);
			System.out.print("The gratuity is: $5.00" + " and the total is $" + bill);
		}
		else{
			temp = 0.15;
			temp = bill * temp;
			tip = temp;
			bill = bill + temp;
			bill = (int)(bill * 100) / 100.00;
			tip = (int)(tip * 100) / 100.00;
			System.out.print("The gratuity is: $" + tip + " and the total is $" + bill);
		}
		
	}
}
