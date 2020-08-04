
public class Student extends Person{
	public final int FRESHMAN = 1;
	public final int SOPHOMORE = 2;
	public final int JUNIOR = 3;
	public final int SENIOR = 4;
	String status;
	
	Student()
	{
		
	}
	Student(String n, String a,String num,int age1,String email1, int s)
	{
		name = n;
		address = a;
		number = num;
		age = age1;
		email = email1;
		if(s == 1)
		status = "FRESHMAN";
		if(s == 2)
			status = "SOPHOMORE";
		if(s == 3)
			status = "JUNIOR";
		if(s == 4)
			status = "SENIOR";
	}
	public String toString()
	{
		return ("Name: " + name + "\nAddress: " + address + "\nPhone: " + number + "\nAge: "+ age + "\nEmail: "+ email + "\nGrade: " + status);
	}
}
