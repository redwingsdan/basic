
interface Colorable {
	public void howToColor();
}

public class Square extends GeometricObject implements Colorable
{
	private double side;

		// TODO Auto-generated constructor stub
	public Square(double side)
	{
		this.side = side;
	}
	public void howToColor()
	{
		System.out.println("Color all four sides");
	}
	public double getArea()
	{
		return side * side;
	}
	public double getPerimeter()
	{
		return 4 * side;
	}
	public static void main(String[] args)
	{
		Square[] s1 = {new Square(3.0), new Square(2.0), new Square(4.0), new Square (5.0), new Square(6.0)};
		for(int i = 0; i< s1.length; i++)
		{
		System.out.println("\nSquare #" + (i+1));
		System.out.println("Area: " + s1[i].getArea());
		System.out.println("Perimeter: " + s1[i].getPerimeter());
		System.out.println("Call the howToColor method: ");
		((Colorable)s1[i]).howToColor();
		}
		
	}
}
