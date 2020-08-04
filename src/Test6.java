
public class Test6 {

	public static void main(String[] args)
	{
		Person p1 = new Person("Dan", "11 Hemlock Lane", "6313741510", 20, "djp21795@yahoo.com");
		Student s1 = new Student("Dan", "11 Hemlock Lane", "6313741510", 20, "djp21795@yahoo.com", 3);
		Employee e1 = new Employee("Dan", "11 Hemlock Lane", "6313741510", 20, "djp21795@yahoo.com", 65000, true, "4/2/15");
		Faculty f1 = new Faculty("Dan", "11 Hemlock Lane", "6313741510", 20, "djp21795@yahoo.com", 65000, true, "4/2/15", 40, 2);
		Staff staff1 = new Staff("Dan", "11 Hemlock Lane", "6313741510", 20, "djp21795@yahoo.com", 65000, true, "4/2/15", "Principal");
		
		System.out.println("PERSON\n" + p1.toString());
		System.out.println();
		System.out.println("STUDENT\n" + s1.toString());
		System.out.println();
		System.out.println("EMPLOYEE\n" + e1.toString());
		System.out.println();
		System.out.println("FACULTY\n" + f1.toString());
		System.out.println();
		System.out.println("STAFF\n" + staff1.toString());
	}
}
