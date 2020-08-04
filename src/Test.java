
//import java.util.Scanner;
public class Test{
	public static void main(String[] args)
	{
		double w, h;
		String c;
	
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		r1.setColor("red");
		r2.setColor("red");
		
		System.out.println("Rectangle #1");
		System.out.print(r1.getWidth() + "\n" + r1.getHeight() + "\n" + r1.getColor() + "\n" + r1.getArea() + "\n" + r1.getPerimeter() + "\n\n\n");
		System.out.println("Rectangle #2");
		System.out.print(r2.getWidth() + "\n" + r2.getHeight() + "\n" + r2.getColor() + "\n" + r2.getArea() + "\n" + r2.getPerimeter() + "\n");
	}
	
	
}
