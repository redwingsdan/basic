
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter an integer:");
		n = input.nextInt();
		reverse(n);
	}

	public static void reverse(int n) {
		int temp = 0;
		while(n != 0){
		temp = temp * 10;
		temp = temp + n % 10;
		n = n / 10;
		}
		System.out.println("The reverse is = " + temp);
	}
}
