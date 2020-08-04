import java.util.Scanner;


public class MatrixProduct {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//int i, j;
		double[][] N;
		double[][] M;
		M = new double [][] {{5,6}, 
							{7,8}};
		N = new double[][] {{1,2}, 
							{3,4}};
		multMatrix(M, N);
		
	}

	private static void multMatrix(double[][] m, double[][] n) {
		
		int i,j,k;
		double [][] temp;
		temp = new double[][] {{0,0} , {0,0}};
		/*int x = n[0].length;
		x=0;
		double [][] temp;
		temp = new double[][] {{0,0} , {0,0}};
		for (i=0; i<m.length;i++){
			for(j=0;j<n[i].length;j++){
				temp[i][x] += (m[i][j] * n[j][i]);
				//System.out.print(temp[i][j] + ", ");
			}
			System.out.println(temp[i][x] + ", ");
		//	System.out.println("");
			
		}*/
		  for (i = 0; i < m.length; i++) { // aRow
	            for (j = 0; j < n[0].length; j++) { // bColumn
	                for (k = 0; k < m[0].length; k++) { // aColumn
	                    temp[i][j] += m[i][k] * n[k][j];
	                }
	            }
	        }
		  for(i=0;i<m.length;i++){
			  for(j=0;j<n[0].length;j++){
				  System.out.print(temp[i][j] + ", ");
			  }
			  System.out.println("");
		  }
		  }
}