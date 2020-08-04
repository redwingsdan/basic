
public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	int speed = SLOW;
	boolean on = false;
	double radius = 5.0;
	String color = "blue";
	
	Fan()
	{
		
	}
	
//	final int SLOW = 1;
//	final int MEDIUM = 2;
//	final int FAST = 3;
	
	void setSpeed(int s)
	{
		speed = s;
	}
	void setOn(boolean o)
	{
		on = o;
	}
	void setRadius(double r)
	{
		radius = r;
	}
	void setColor(String c)
	{
		color = c;
	}
	
	int getSpeed()
	{
		return speed;
	}
	Boolean getOn()
	{
		return on;
	}
	double getRadius()
	{
		return radius;
	}
	String getColor()
	{
		return color;
	}
	
	
	public String toString()
	{
		if(on == true)
		{
			return speed + "\n" + color + "\n" + radius;
		}
		else
			return color + "\n" + radius + "\n" + "fan is off";
	}
	
}
