import java.util.Scanner;

public class NumSystemConversions {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n1, i, temp;
		System.out.println("Choose a conversion mode:\n(1)Decimal to Binary\n(2)Decimal to Hex\n(3)Decimal to Octal");
		System.out.println("(4)Binary to Decimal\n(5)Hex to Decimal\n(6)Hex to Octal");
		i = input.nextInt();
		//System.out.println("Enter the number to be converted: ");
		//n1 = input.nextInt();
		switch(i){
		case 1:
			System.out.println("Enter the number to be converted(0 - 255): ");
			n1 = input.nextInt();
			System.out.println("The number " + n1 + " in binary is = ");
			temp = n1 / 128;
			System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 128;
			temp = n1 / 64;
			System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 64;
			temp = n1 / 32;
			System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 32;
			temp = n1 / 16;
			System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 16;
			temp = n1 / 8;
			System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 8;
			temp = n1 / 4;
			System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 4;
			temp = n1 / 2;
			System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 2;
			temp = n1 / 1;
			System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 1;
			System.out.println(" in binary");
			break;
		case 2:
			System.out.println("Enter the number to be converted(0 - 255): ");
			n1 = input.nextInt();
			System.out.print("The number " + n1 + " in hex is = ");
			temp = n1 / 128;
			//System.out.print(temp);
			int b7 = temp;
			if(temp == 1)
				n1 = n1 - 128;
			temp = n1 / 64;
			//System.out.print(temp);
			int b6 = temp;
			if(temp == 1)
				n1 = n1 - 64;
			temp = n1 / 32;
			int b5 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 32;
			temp = n1 / 16;
			int b4 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 16;
			temp = n1 / 8;
			int b3 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 8;
			temp = n1 / 4;
			int b2 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 4;
			temp = n1 / 2;
			int b1 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 2;
			temp = n1 / 1;
			int b0 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 1;
			if(b7 == 0 && b6 == 0 && b5 == 0 && b4 == 0)
				System.out.print("0");
			if(b7 == 0 && b6 == 0 && b5 == 0 && b4 == 1)
				System.out.print("1");
			if(b7 == 0 && b6 == 0 && b5 == 1 && b4 == 0)
				System.out.print("2");
			if(b7 == 0 && b6 == 0 && b5 == 1 && b4 == 1)
				System.out.print("3");
			if(b7 == 0 && b6 == 1 && b5 == 0 && b4 == 0)
				System.out.print("4");
			if(b7 == 0 && b6 == 1 && b5 == 0 && b4 == 1)
				System.out.print("5");
			if(b7 == 0 && b6 == 1 && b5 == 1 && b4 == 0)
				System.out.print("6");
			if(b7 == 0 && b6 == 1 && b5 == 1 && b4 == 1)
				System.out.print("7");
			if(b7 == 1 && b6 == 0 && b5 == 0 && b4 == 0)
				System.out.print("8");
			if(b7 == 1 && b6 == 0 && b5 == 0 && b4 == 1)
				System.out.print("9");
			if(b7 == 1 && b6 == 0 && b5 == 1 && b4 == 0)
				System.out.print("A");
			if(b7 == 1 && b6 == 0 && b5 == 1 && b4 == 1)
				System.out.print("B");
			if(b7 == 1 && b6 == 1 && b5 == 0 && b4 == 0)
				System.out.print("C");
			if(b7 == 1 && b6 == 1 && b5 == 0 && b4 == 1)
				System.out.print("D");
			if(b7 == 1 && b6 == 1 && b5 == 1 && b4 == 0)
				System.out.print("E");
			if(b7 == 1 && b6 == 1 && b5 == 1 && b4 == 1)
				System.out.print("F");
			
			
			if(b3 == 0 && b2 == 0 && b1 == 0 && b0 == 0)
				System.out.print("0");
			if(b3 == 0 && b2 == 0 && b1 == 0 && b0 == 1)
				System.out.print("1");
			if(b3 == 0 && b2 == 0 && b1 == 1 && b0 == 0)
				System.out.print("2");
			if(b3 == 0 && b2 == 0 && b1 == 1 && b0 == 1)
				System.out.print("3");
			if(b3 == 0 && b2 == 1 && b1 == 0 && b0 == 0)
				System.out.print("4");
			if(b3 == 0 && b2 == 1 && b1 == 0 && b0 == 1)
				System.out.print("5");
			if(b3 == 0 && b2 == 1 && b1 == 1 && b0 == 0)
				System.out.print("6");
			if(b3 == 0 && b2 == 1 && b1 == 1 && b0 == 1)
				System.out.print("7");
			if(b3 == 1 && b2 == 0 && b1 == 0 && b0 == 0)
				System.out.print("8");
			if(b3 == 1 && b2 == 0 && b1 == 0 && b0 == 1)
				System.out.print("9");
			if(b3 == 1 && b2 == 0 && b1 == 1 && b0 == 0)
				System.out.print("A");
			if(b3 == 1 && b2 == 0 && b1 == 1 && b0 == 1)
				System.out.print("B");
			if(b3 == 1 && b2 == 1 && b1 == 0 && b0 == 0)
				System.out.print("C");
			if(b3 == 1 && b2 == 1 && b1 == 0 && b0 == 1)
				System.out.print("D");
			if(b3 == 1 && b2 == 1 && b1 == 1 && b0 == 0)
				System.out.print("E");
			if(b3 == 1 && b2 == 1 && b1 == 1 && b0 == 1)
				System.out.print("F");
			break;
		case 3:
			System.out.println("Enter the number to be converted(0 - 255): ");
			n1 = input.nextInt();
			System.out.print("The number " + n1 + " in octal is = ");
			temp = n1 / 128;
			//System.out.print(temp);
			int bt7 = temp;
			if(temp == 1)
				n1 = n1 - 128;
			temp = n1 / 64;
			//System.out.print(temp);
			int bt6 = temp;
			if(temp == 1)
				n1 = n1 - 64;
			temp = n1 / 32;
			int bt5 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 32;
			temp = n1 / 16;
			int bt4 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 16;
			temp = n1 / 8;
			int bt3 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 8;
			temp = n1 / 4;
			int bt2 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 4;
			temp = n1 / 2;
			int bt1 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 2;
			temp = n1 / 1;
			int bt0 = temp;
			//System.out.print(temp);
			if(temp == 1)
				n1 = n1 - 1;
			
			if(bt7 == 0 && bt6 == 0)
				System.out.print("0");
			if(bt7 == 0 && bt6 == 1)
				System.out.print("1");
			if(bt7 == 1 && bt6 == 0)
				System.out.print("2");
			if(bt7 == 1 && bt6 == 1)
				System.out.print("3");
			
			if(bt5 == 0 && bt4 == 0 && bt3 == 0)
				System.out.print("0");
			if(bt5 == 0 && bt4 == 0 && bt3 == 1)
				System.out.print("1");
			if(bt5 == 0 && bt4 == 1 && bt3 == 0)
				System.out.print("2");
			if(bt5 == 0 && bt4 == 1 && bt3 == 1)
				System.out.print("3");
			if(bt5 == 1 && bt4 == 0 && bt3 == 0)
				System.out.print("4");
			if(bt5 == 1 && bt4 == 0 && bt3 == 1)
				System.out.print("5");
			if(bt5 == 1 && bt4 == 1 && bt3 == 0)
				System.out.print("6");
			if(bt5 == 1 && bt4 == 1 && bt3 == 1)
				System.out.print("7");
			
			if(bt2 == 0 && bt1 == 0 && bt0 == 0)
				System.out.print("0");
			if(bt2 == 0 && bt1 == 0 && bt0 == 1)
				System.out.print("1");
			if(bt2 == 0 && bt1 == 1 && bt0 == 0)
				System.out.print("2");
			if(bt2 == 0 && bt1 == 1 && bt0 == 1)
				System.out.print("3");
			if(bt2 == 1 && bt1 == 0 && bt0 == 0)
				System.out.print("4");
			if(bt2 == 1 && bt1 == 0 && bt0 == 1)
				System.out.print("5");
			if(bt2 == 1 && bt1 == 1 && bt0 == 0)
				System.out.print("6");
			if(bt2 == 1 && bt1 == 1 && bt0 == 1)
				System.out.print("7");
			break;
		case 4:
			int j;
			String binary = "";
			System.out.println("Enter a binary number: ");
			binary = input.next();
			n1 = 0;
			for(j = 0; j < binary.length(); j++){
				n1 = n1 * 2 + (binary.charAt(j) - '0');	
			}
			System.out.println("The decimal number is " + n1);
			break;
			
		case 5:
			String hex = "";
			System.out.println("Enter a hex number: ");
			hex = input.next();
			n1 = 0;
			int k;
			int v = 0;
			for(k = 0; k < hex.length(); k++){
				char h = hex.charAt(k);
				if('0' <= h && h <= '9')
					v = h - '0';
				else if('a' <= h && h <= 'f')
					v = h - 'a' + 10;
				else if('A' <= h && h <= 'F')
					v = h - 'A' + 10;
				else{
					System.out.println("Invalid input");
					System.exit(i);
				}				
				n1 = n1 * 16 + v;
			}
			System.out.println("The decimal number is " + n1);
			break;
		case 6:
			String octal = "";
			System.out.println("Enter a hex number: ");
			hex = input.next();
			n1 = 0;
			int l;
			int val = 0;
			for(l = 0; l < hex.length(); l++){
				char h = hex.charAt(l);
				if('0' <= h && h <= '9')
					val = h - '0';
				else if('a' <= h && h <= 'f')
					val = h - 'a' + 10;
				else if('A' <= h && h <= 'F')
					val = h - 'A' + 10;
				else{
					System.out.println("Invalid input");
					System.exit(i);
				}				
				n1 = n1 * 16 + val;
			}
			while(n1 != 0){
				octal = (n1 % 8) + octal;
				n1 /= 8;
			}
			System.out.println("The octal number is " + octal);
			break;
		default:
				System.out.println("Invalid runmode");
		}
		
	}
}
