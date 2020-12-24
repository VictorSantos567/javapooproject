package calculator;

public class CurrenyConverter {
	public static double IOF = 0.06;

	public static double converter(double pricedollar, double amountDollar) {
		return pricedollar * amountDollar * (1.0 + IOF);
	}

}
