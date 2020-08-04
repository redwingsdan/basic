import java.util.Scanner;

public class CheckNum {
	public static void main(String[] args){
		int n;
		boolean x, y;
		System.out.println("Please enter an integer: ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		if(n % 5 == 0){
			x = true;
		}
		else{
			x = false;
		}
		if(n % 6 == 0){
			y = true;
		}
		else{
			y = false;
		}
		
		System.out.print("The number " + n + " is ");
		if(x && y == true)
			System.out.println("divisible by both 5 and 6");
		if(!x && y == true)
			System.out.println("divisible by 6 but not 5");
		if(x && !y == true)
			System.out.println("divisible by 5 but not 6");
		if(!x && !y == true)
			System.out.println("divisible by neither 5 nor 6");
		
	}
}
