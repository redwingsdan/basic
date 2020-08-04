import java.util.Scanner;

public class MajorDiagonal {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("How long is the array?");
		int MAX = input.nextInt();
		double x;
		int i, j;
		double[][] N;
		N = new double[MAX][MAX];
		for(i=0; i<MAX; i++){
			for(j = 0; j < MAX; j++){
			System.out.println("Enter a value for array element [" + i + "][" + j + "]: ");
			x = input.nextInt();
			N[i][j] = x;
			}
		}
		
		double sum = sumMajorDiagonal(N);
		System.out.println("The sum is = " + sum);
		
	}
	
	public static double sumMajorDiagonal(double [][] m){
		double sum = 0;
		int i;
		for(i=0;i<m.length;i++){
			sum += m[i][i];
		}
		
		return sum;
	}
}
