import java.util.Scanner;
public class DaysinMonth {
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		int month, year;
		String monthreal = "null";
		System.out.println("Enter the number of the month that you want to use: ");
		month = input.nextInt();
		System.out.println("Enter the year that you want to use: ");
		year = input1.nextInt();
		switch(month){
		case 1:
			monthreal = "January";
			break;
		case 2:
			monthreal = "February";
			break;
		case 3:
			monthreal = "March";
			break;
		case 4:
			monthreal = "April";
			break;
		case 5:
			monthreal = "May";
			break;
		case 6:
			monthreal = "June";
			break;
		case 7:
			monthreal = "July";
			break;
		case 8:
			monthreal = "August";
			break;
		case 9:
			monthreal = "September";
			break;
		case 10:
			monthreal = "October";
			break;
		case 11:
			monthreal = "November";
			break;
		case 12:
			monthreal = "December";
			break;
		default:
			break;
		}
		
		if(month == 4 || month == 6 || month == 9 || month == 11)
			System.out.println(monthreal + " " + year + " has 30 days");
		if((month == 2) && (year % 4) != 0)
			System.out.println("February" + " " + year + " has 28 days");
		if((month == 2) && (year % 4) == 0){
			if((year % 100) == 0 && (year % 400) != 0){
				System.out.println("February" + " " + year + " has 28 days");
			}
			else{
			System.out.println("February" + " " + year + " has 29 days");
			}
		}
		else{
			System.out.println(monthreal + " " + year + " has 31 days");
		}
	}
}
