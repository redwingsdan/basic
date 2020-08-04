
public class Largest {
	public static int largest(int[] a)
	{
		largest(a,0);
	}
	public static int largest(int [] a, int i)
	{
		if(i==a.length-1)
			return a[i];
		int largestInTail = largest(a, i+1);
		if(a[i] > largestInTail)
			return a[i];
		return largestInTail;
	}
	public static void main(String[] args)
	{
		System.out.println(largest(new int[]{4,5,7,1,8,0}));
	
	}
}
