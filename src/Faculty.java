
public class Faculty extends Employee {

	int hours;
	int rank;
	
	Faculty()
	{
		
	}
	
	Faculty(String n, String a,String num,int age1,String email1, double s, boolean o, String d, int h, int r)
	{
		name = n;
		address = a;
		number = num;
		age = age1;
		email = email1;
		salary = s;
		office = o;
		date = d;
		//date = toDate(d);
		hours = h;
		rank = r;
	}
	
	public String toString()
	{
		return ("Name: " + name + "\nAddress: " + address + "\nPhone: " + number + "\nAge: "+ age + "\nEmail: "+ email + "\nSalary: " + salary + "\nOffice: " + office + "\nDate: " +date + "\nHours: " + hours + "\nRank: " + rank);
	}
	
	int salaryRange(int rank)
	{
		if((rank * years) < 10)
			return 1;
		else if((rank*years) >= 10 && (rank*years) < 20)
			return 2;
		else if(20 <= (rank * years))
			return 3;
		else
		return 0;
	}
}
