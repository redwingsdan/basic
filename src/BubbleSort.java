import java.util.Scanner;


public class BubbleSort {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//System.out.println("How long is the array?");
		//int MAX = input.nextInt();
		//double x;
		int i, j;
		double[] N;
		N = new double[] {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
		
		Bubble(N);
		
	}
	public static void Bubble(double[]list){
		boolean changed = true;
		double temp;
		do {
		changed = false;
		for (int j = 0; j < (list.length - 1); j++)
		if (list[j] > list[j + 1]) {
		//swap list[j] with list[j + 1];
			temp = list[j+1];
			list[j+1] = list[j];
			list[j] = temp;
			changed = true;
		}
		} while (changed);
		for(int i = 0; i < list.length; i++){
			System.out.println(list[i]);
		}
	}
	
}
