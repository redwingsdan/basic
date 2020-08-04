import java.util.Scanner;
public class Printarray {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i,n,j;
		int [] N;
		N = new int[10];
		int [] M;
		M = new int[10];
		boolean flag = true;
		for(i=0;i<10;i++){
			flag = true;
			System.out.println("Enter a number: ");
			n = input.nextInt();
			for(j=0; j<10; j++){
			if(n == N[j])
				flag = false;
				M[i] = 0;
			}
			if(flag == true){
				N[i]= n;
				M[i] = 1;
				//System.out.println(N[i]);
			}
		}
		for(i=0;i<10;i++){
			if(M[i] == 1)
				System.out.println(N[i]);
			
		}
	}
}
