import java.util.Scanner;
public class PrintSumReverseArray {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("How long is the array?");
		int MAX = input.nextInt();
		int x;
		int i, j;
		int[] N;
		N = new int[MAX];
		for(i=0; i<MAX; i++){
			System.out.println("Enter a value for array element " + i + ": ");
			x = input.nextInt();
			N[i] = x;
		}
		int l = N.length;
		System.out.println("Which method do you want to use?\n(1) Print Array\n(2) Sum Array\n(3) Reverse Array");
		j = input.nextInt();
		switch(j){
		case 1:
			printarray(N, l);
			break;
		case 2:
			sumarray(N, l);
			break;
		case 3: 
			reversearray(N, l);
			break;
		default:
			System.out.println("INVALID!");
		}
	
	
	
	}
	
	private static void sumarray(int[] N, int l) {
		int i, sum = 0;
		//int j = N.length;
		for(i=0; i< l; i++){
			sum += N[i];
			//System.out.println(sum);
		}
		System.out.println("The sum of the array is: " + sum);
	}

	private static void reversearray(int[] N, int l) {
		int i, temp;
		//int j = N.length;
		int k = (l - 1);
		for(i = 0; i < (l/ 2); i++){
			temp = N[i];
			N[i] = N[k];
			N[k] = temp;
			k--;
		}
		for(i=0;i<l;i++){
				System.out.println(N[i]);
			
		}
	}

	private static void printarray(int[] N, int l) {
		int i,n,j, count = 0;
		//int [] N;
		//N = new int[10];
		int [] M;
		M = new int[10];
		//Scanner input1 = new Scanner (System.in);
		boolean flag = true;
		for(i=0;i<l;i++){
			flag = true;
			//System.out.println(N[i]);
			//n = input1.nextInt();
			for(j=i+1; j<l; j++){
			//System.out.println(N[j]);
			if(N[i] == N[j]){
				flag = false;
				M[i] = 0;
			}
			if(flag == true){
				//N[i]= n;
				M[i] = 1;
				//System.out.println(N[i]);
			}
			}
		}
		for(i=0;i<l;i++){
			//System.out.println(M[i]);
			if(M[i] == 1)
				System.out.println(N[i]);
			
		}
		for(i=0;i<(l-1);i++){
			if(M[i] != 0)
				count++;
			//System.out.println(count);
		}
		if(count == (l-1))
			System.out.println(N[l-1]);
		//return N[i];
		
	}
}
