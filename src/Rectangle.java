
public class Rectangle extends GeometricObject implements Comparable{

	double width = 1.0;
	double height = 1.0;
	String color = "white";
	
	
	Rectangle()
	{
	
	}
	Rectangle(double w, double h)
	{
		width = w;
		height = h;
	}
	double getWidth()
	{
		return width;
	}
	double getHeight()
	{
		return height;
	}
	public String getColor()
	{
		return color;
	}
	
	void setWidth(double w)
	{
		width = w;
	}
	void setHeight(double h)
	{
		height = h;
	}
	public void setColor(String c)
	{
		color = c;
	}
	double getArea()
	{
		return (width * height);
	}
	
	double getPerimeter()
	{
		return (2 * (width + height));
	}
	
	public int compareTo(Object o) {
		if (getArea() > ((Rectangle)o).getArea())
		return 1;
		else if (getArea() < ((Rectangle)o).getArea())
		return -1;
		else
		return 0;
		}

public static void main(String[] args) {
Rectangle rectangle1 = new Rectangle(4, 5);
Rectangle rectangle2 = new Rectangle(3, 6);
Circle circle1 = new Circle(4);
Circle circle2 = new Circle(7);
System.out.println((Object)Max.max(rectangle1, rectangle2));
System.out.println("Bigger area is: " +(Object)((Rectangle) Max.max(rectangle1, rectangle2)).getArea());

System.out.println((Object)Max.max(circle1, circle2));
System.out.println("Bigger area is: " +(Object)((Circle) Max.max(circle1, circle2)).getArea());
}

}

