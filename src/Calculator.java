import java.util.Scanner;


public class Calculator {
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		String s = input.next();
		System.out.println("BEGIN");
	
		String [] parts;
		String delimiter = "+";
		parts = s.split(delimiter);
		for(int i = 0; i < 3; i++){
		System.out.println(parts[i]);
		}
		String p1 = parts[0];
		String p2 = parts[1];
		System.out.println(p1 + " " + p2);
		int n1 = Integer.parseInt(p1);
		int n2 = Integer.parseInt(p2);
		int sum = n1 + n2;
		System.out.println("Sum = " + sum);
		
	}
}
