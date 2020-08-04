import java.util.Scanner;


public class MatrixMult {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//int i, j;
		//double[][] N;
		double x;
		double[][] M;
		M = new double [][] {{1,2}, {3,4}};
		//N = new double[][] {{1,2}, {3,4}};
		System.out.println("Enter a scalar to multiply the matrix by: ");
		x = input.nextDouble();
		multMatrix(M, x);
		
	}

	private static void multMatrix(double[][] m, double x) {
		int i, j;
		for (i=0; i<m.length;i++){
			for(j=0;j<m[i].length;j++){
				m[i][j] = m[i][j] * x;
				System.out.print(m[i][j] + ", ");
			}
			System.out.println("");
		}
	}
}
