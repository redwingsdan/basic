import java.util.Scanner;
public class ProcessScores {
	public static void main(String[] args)throws Exception
	{
		java.io.File file = new java.io.File("test.txt");

		java.io.PrintWriter output = new java.io.PrintWriter(file);
		output.print("1 2 3 4 5 6 7 8 9 0 8 7 65 5 4 3 4 6 7 8 76 5 4 6 8 98 76 5 43 6 78 76 54 78 7 656 6 5 65 64 63 64 7 458 456 836 734 57 34 7 3467 43 7 347 43 57 43 75 4357 45 7435 7 45 73 45 7 435 7 45 7 34 57 4 57 45 73 45 7 435 7 435 7 45 7 45 7 45 7 45 97 78 0 87 43 2 978 0 98 2346 28 9 0 8 7 65 5 4 3 4 6 7 8 76 5 4 6 8 98 76 5 43 6 78 76 54 78 7 656 6 5 65 64 63 64 7 458 456 836 734 57 34 7 3467 43 7 347 43 57 43 75 4357 45 7435 7 45 73 45 7 435 7 45 7 34 57 4 57 45 73 45 7 435 7 435 7 45 7 45 7 45 7 45 97 78 0 87 43 2 978 0 98 2346 2");
		output.close();
		Scanner input = new Scanner(file);
		int score = 0;
		int sum = 0;
		int count = 0;
		while (input.hasNext()) 
		{
			String firstName = input.next();
			score = Integer.parseInt(firstName);
		
			sum = sum + score;
			count++;
			
			System.out.println(firstName + " ");
		}
		System.out.println("Total = " + sum);
		double average = sum / count;
		System.out.println("Average = " + average);
		input.close();
	}
}
