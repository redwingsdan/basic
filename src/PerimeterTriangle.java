//Daniel Peterson (109091561)
//This program prints three user-determined
//values for a triangle

import java.util.Scanner;
public class PerimeterTriangle {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double s1, s2, s3;
		System.out.println("Please enter 3 values for the length of a triangle:");
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		if((s1 + s2) < s3 && (s1 + s3) < s2 && (s2 + s3) < s1){
			System.out.print("One or more of the values you entered is invalid");
		}
		if(s1 <= 0 || s2 <= 0 || s3 <= 0){
			System.out.print("One or more of the values you entered is invalid");
		}
		else{
			System.out.println("The three sides of the triangle are lengths " + s1 + ", " + s2 + ", " + s3);
			double area = 0.5 * s1 * s2 * s3;
			System.out.print("The area = " + area);
			double perimeter = s1 + s2 + s3;
			System.out.print("\nThe perimeter = " + perimeter);
		}
		
	}
}
