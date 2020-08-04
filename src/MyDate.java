
public class MyDate {
	int years;
	int month;
	int day;
	
	MyDate()
	{
		
	}
	
	MyDate(int y, int m, int d)
	{
		month = m;
		years = y;
		day = d;
	}
	
	public String toDate(String d)
	{
		for(int i = 0; i < d.length(); i++)
		{
			d.toCharArray();
			if(d.contains("/"))
			{
				
			}
		}
		return "Month = " + month + "\nDay = " + day + "\nYear = " + years;
	}
}
