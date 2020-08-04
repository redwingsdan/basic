
public class Triangle extends GeometricObject {
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	Triangle()
	{
		
	}
	
	Triangle(double s1, double s2, double s3, String c, boolean f)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;
		setColor(c);
		setFilled(f);
	}
	
	double getS1()
	{
		return side1;
	}
	double getS2()
	{
		return side2;
	}
	double getS3()
	{
		return side3;
	}
	void setS1(double s1)
	{
		side1 = s1;
	}
	void setS2(double s2)
	{
		side2 = s2;
	}
	void setS3(double s3)
	{
		side3 = s3;
	}
	
	double getArea()
	{
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt( (s)*((s-side1)*(s-side2)*(s-side3)));
	}
	
	double getPerimeter()
	{
		return (side1 + side2 + side3);
	}
	
//	public String toString()
//	{
//		return "created on " + dateCreated + "\ncolor: " + color +
//				" and filled: " + filled;
//	}
}
