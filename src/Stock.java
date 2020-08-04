
public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock()
	{
		
	}
	Stock(String s, String n)
	{
		name = n;
		symbol = s;
	}
	
	String getSymbol()
	{
		return symbol;
	}
	String getName()
	{
		return name;
	}
	double getPreviousClosingPrice()
	{
		return previousClosingPrice;
	}
	double getCurrentPrice()
	{
		return currentPrice;
	}
	void setPreviousClosingPrice(double p)
	{
		previousClosingPrice = p;
	}
	void setCurrentPrice(double c)
	{
		currentPrice = c;
	}
	
	double changePercent()
	{
		double percent = currentPrice - previousClosingPrice;
		percent = (percent / previousClosingPrice) * 100;
		return percent;
	}
}
