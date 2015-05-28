package DesignPatterns;

public class FixedDiscount implements Strategy {

	@Override
	public int calculatePriceWithDiscount(int price) {
		// TODO Auto-generated method stub
		return price - 100;
	}

}
