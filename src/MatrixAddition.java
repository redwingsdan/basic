import java.util.Scanner;


public class MatrixAddition {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//int i, j;
		double[][] N;
		double[][] M;
		M = new double [][] {{5,6}, {7,8}};
		N = new double[][] {{1,2}, {3,4}};
		addMatrix(M, N);
		
	}

	private static void addMatrix(double[][] m, double[][] n) {
		int i,j;
		double [][] temp;
		temp = new double[][] {{0,0} , {0,0}};
		for (i=0; i<m.length;i++){
			for(j=0;j<m[0].length;j++){
				temp[i][j] = m[i][j] + n[i][j];
				System.out.print(temp[i][j] + ", ");
			}
			System.out.println("");
		}
		
	}
}
