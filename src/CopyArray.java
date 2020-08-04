import java.util.Scanner;
public class CopyArray {
	public static void main(String[] args){
		int i, n;
		Scanner input = new Scanner (System.in);
		int [] array;
		array = new int[100];
		int [] array1;
		array = new int[100];
		System.out.println("How many elements do you want in the array?");
		n = input.nextInt();
		for(i = 0; i < n; i++){
			System.out.println("Enter element " + i + " of the array");
			array[i] = input.nextInt();
		}
		array1 = AddArray(array, n);
		for(i=0;i<n;i++){
			System.out.println(array1[i]);
		}
	}

	private static int[] AddArray(int[] array, int n) {
		int i;
		for(i=0;i<n;i++){
			array[i] = array[i] + 1;
		}
		return array;
	}
}
