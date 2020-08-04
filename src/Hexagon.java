
public class Hexagon extends GeometricObject{
	double side1 = 1.0;
	
	
	Hexagon()
	{
		
	}
	
	Hexagon(double s1, String c, boolean f)
	{
		side1 = s1;
		setColor(c);
		setFilled(f);
	}
	
	double getS1()
	{
		return side1;
	}

	void setS1(double s1)
	{
		side1 = s1;
	}
	
	double getArea()
	{
		return (Math.sqrt(3) * 3 * side1*side1) / 2;
	}
	
	double getPerimeter()
	{
		return (side1 * 6);
	}
}
