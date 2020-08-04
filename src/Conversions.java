import java.util.Scanner;
public class Conversions {
	public static void main(String[] args){	
		
		String c;
		double lbs, kilos, km, miles, output;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for c\nA – convert pounds to kilos\nB – convert kilos to pounds\nC – convert kilometers to miles");
		System.out.println("D – convert miles to kilometers\nE - Exit");
		c = input.next();
		switch(c){
		
		case "A":
			System.out.println("Enter a value in pounds: ");
			lbs = input.nextDouble();
			output = poundsToKilos(lbs);
			System.out.println("The output is: " + output);
			break;
		case "B":
			System.out.println("Enter a value in kilos: ");
			kilos = input.nextDouble();
			output = kilosToPounds(kilos);
			System.out.println("The output is: " + output);
			break;
		case "C":
			System.out.println("Enter a value in kilometers: ");
			km = input.nextDouble();
			output = kmToM(km);
			System.out.println("The output is: " + output);
			break;
		case "D":
			System.out.println("Enter a value in miles: ");
			miles = input.nextDouble();
			output = MToKm(miles);
			System.out.println("The output is: " + output);
			break;
		case "E":
			System.out.println("Goodbye!");
			break;
			
		default:
			System.out.println("INVALID INPUT!");
			break;
		
		}
	}

	private static double MToKm(double miles) {
		double kilometers;
		kilometers = miles * 1.609;
		kilometers = (int)(kilometers * 1000) / 1000.000;
		return kilometers;
	}

	private static double kmToM(double km) {
		double miles;
		miles = km / 1.609;
		miles= (int)(miles * 1000) / 1000.000;
		return miles;
	}

	private static double kilosToPounds(double kilos) {
		double pounds;
			pounds = kilos * 2.2;
			pounds = (int)(pounds * 100) / 100.00;
		return pounds;
	}

	private static double poundsToKilos(double lbs) {
		double kilos;
		kilos = lbs / 2.2;
		kilos = (int)(kilos * 100) / 100.00;
		return kilos;
	}
}
