//Daniel Peterson (109091561)
//This program prints the prime numbers from
//2 to 10000

public class PrimeNum {
	public static void main(String[] args){
		int n1, i, j, c = 1;
		boolean flag = false;
		System.out.print(2 + ", ");
		for(i = 3; i <= 10000; i++){
			flag = false;
			for(j = 2; j < i; j++){
				if(i % j == 0){
					flag = true;
				}
			}
			if(flag == false){
				n1 = i;
				System.out.print(n1 + ", ");
				c++;
				if(c == 20){
					System.out.print("\n");
					c = 0;
				}
			}
		}
	}
}
