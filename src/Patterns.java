import java.util.Scanner;
public class Patterns {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int n, j = 1;
		System.out.println("Enter a number to be displayed: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i++){
			j = i;
			while(j > 0){
			System.out.print(j--);
			
			}
			System.out.println("");
		}
	}
}
