
public class Employee extends Person {

	double salary;
	boolean office;
	String date;
	
	Employee()
	{
		
	}
	
	Employee(String n, String a,String num,int age1,String email1, double s, boolean o, String d)
	{
		name = n;
		address = a;
		number = num;
		age = age1;
		email = email1;
		salary = s;
		office = o;
		//date = toDate(d);
		date = d;
	}
	
	public String toString()
	{
		return ("Name: " + name + "\nAddress: " + address + "\nPhone: " + number + "\nAge: "+ age + "\nEmail: "+ email + "\nSalary: " + salary + "\nOffice: " + office + "\nDate: " +date);
	}
}
