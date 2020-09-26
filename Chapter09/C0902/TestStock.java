package PackageChapter09;

public class TestStock {

	public static void main(String[] args) {

		Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);

		System.out.println("Welcome to " + stock.symbol + ", " + stock.name);
		System.out.println("Previous day's closing price: " + stock.previousClosingPrice);
		System.out.println("Today's closing price: " + stock.currentPrice);
		System.out.println("The price-change percentage is %" + stock.getChangePercent());
	}
}
