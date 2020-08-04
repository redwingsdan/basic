
public class Test2{
	public static void main(String[] args)
	{
		//double w, h;
		//String c;
	
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		f2.setColor("blue");
		f2.setOn(false);
		f2.setRadius(5);
		f2.setSpeed(2);
		f1.setColor("yellow");
		f1.setOn(true);
		f1.setRadius(10);
		f1.setSpeed(3);
		//Rectangle r2 = new Rectangle(3.5, 35.9);
		//f1.setColor("red");
		//r2.setColor("red");
		
		System.out.println("Fan #1");
		System.out.println(f1.toString());
		System.out.println("Fan #2");
		System.out.println(f2.toString());
		//System.out.print(f1.getWidth() + "\n" + r1.getHeight() + "\n" + r1.getColor() + "\n" + r1.getArea() + "\n" + r1.getPerimeter() + "\n\n\n");
		//System.out.println("Rectangle #2");
		//System.out.print(r2.getWidth() + "\n" + r2.getHeight() + "\n" + r2.getColor() + "\n" + r2.getArea() + "\n" + r2.getPerimeter() + "\n");
	}
	
	
}
