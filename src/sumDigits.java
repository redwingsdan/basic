
public class sumDigits {
	public static int sumdigits(int n){
		if(n<10)
			return n;
		return n%10 + sumdigits(n/10);
	}
	
	public static void main(String[] args)
	{
		System.out.println(sumdigits(1234567));
	}
}
