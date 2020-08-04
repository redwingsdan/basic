
public class Staff extends Employee {
	String title;
	
	Staff()
	{
		
	}
	
	Staff(String n, String a,String num,int age1,String email1, double s, boolean o, String d, String t)
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
		title = t;
	}
	
	public String toString()
	{
		return ("Name: " + name + "\nAddress: " + address + "\nPhone: " + number + "\nAge: "+ age + "\nEmail: "+ email + "\nSalary: " + salary + "\nOffice: " + office + "\nDate: " +date + "\nTitle: " + title);
	}
}
