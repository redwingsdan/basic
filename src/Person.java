
public class Person extends MyDate {
	String name;
	String address;
	String number;
	int age;
	String email;
	
	Person()
	{
		
	}
	Person(String n, String a,String num,int age1,String email1)
	{
		name = n;
		address = a;
		number = num;
		age = age1;
		email = email1;
	}
	
	int getAge()
	{
		return age;
	}
	public String toString()
	{
		return ("Name: " + name + "\nAddress: " + address + "\nPhone: " + number + "\nAge: "+ age + "\nEmail: "+ email);
	}
}
