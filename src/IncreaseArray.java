import java.util.Scanner;
public class IncreaseArray {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i, size = 2;
		int x;
		System.out.println("Enter the size of the array: ");
		size = input.nextInt();
		int [] N;
		N = new int [size];
		for(i=0; i<size; i++){
			System.out.println("Enter a value for the array: ");
			x = input.nextInt();
			N[i] = x;
		}
		N = doubleCapacity(N);
		for (i=0;i<(size *2); i++){
			System.out.println(N[i]);
		}
	}	

	public static int[] doubleCapacity(int[] list){
		int i, j, k;
		j = (list.length - 1);
		k = (j+1) * 2;
		int [] temp;
		temp = new int [k];
		for(i=0;i<=j;i++){
			temp[i] = list[i];
		}
		for(i = (j+1); i< k; i++){
			temp[i] = 0;
		}
		list = new int [k];
		for(i = 0; i < k; i++){
			list[i] = temp[i];
			//list[i] = 0;
		}
		return list;
	}
	
}