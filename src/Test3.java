
public class Test3 {
	public static void main(String[] args)
	{
		Stock s1 = new Stock("SYSE:IBM", "International Business Machines Corporation");
		s1.setPreviousClosingPrice(100);
		s1.setCurrentPrice(90);
		System.out.println("Symbol: " + s1.getSymbol() + "\nName: " + s1.getName() + "\nPrevious Price: " + s1.getPreviousClosingPrice() + "\nCurrent Price: " + s1.getCurrentPrice() + "\nPercent Change: " + s1.changePercent());
	}
}
