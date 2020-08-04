import java.util.Scanner;
public class Counting {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final int MAX = 100;
		int i = 0;
		int [] N;
		int pos = 0, neg = 0, sum = 0;
		float average;
		N = new int[MAX];
		boolean flag = false;
		while(flag == false){
			System.out.println("Enter a number: ");
			N[i] = input.nextInt();
			if(N[i] > 0)
				pos++;
			if(N[i] < 0)
				neg++;
			if(N[i] == 0)
				flag = true;
			sum += N[i];	
			i++;
			System.out.println(sum);
		}
		i--;
		//average = (float)(sum / i);
		average = (sum) / (float)i;
		System.out.println("The average of all the numbers is: " + average);
	}
}
