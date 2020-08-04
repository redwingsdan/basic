import java.util.Scanner;
public class ArrayAvg {
	public static void main(String[] args){
		//final int MAX = 100;
		int [] N;
		int i;
		double [] M;
		N = new int[10];
		M = new double[10];
		int in1;
	//	boolean flag = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array type you want to use: ");
		in1 = input.nextInt();
		if(in1 == 1){
			int average1 = average(N);
			System.out.println("The average is " + average1);

		}
		
		if(in1 == 2){
			double average = averagedouble(M);
			
			System.out.println("The average is: "+ average);
		}
		
	}
	public static int average(int[] array){
		int i, avg = 0;
		Scanner input1 = new Scanner(System.in);
		for(i = 0; i < 10; i++){
			System.out.println("Enter element " + i + " of the array");
			array[i] = input1.nextInt();
			avg += array[i];
		}
		avg = avg / 10;
		return avg;
	}
	
	public static double averagedouble(double[] array){
		int i;
		double avg = 0;
		Scanner input2 = new Scanner(System.in);
			for(i = 0; i< 10; i++){
				System.out.println("Enter element " + i + " of the array");
				array[i] = input2.nextDouble();
				avg += array[i];
		}
			avg = avg / 10;
		return avg;
	}
}
