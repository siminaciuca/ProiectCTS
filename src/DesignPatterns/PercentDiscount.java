package DesignPatterns;

public class PercentDiscount implements Strategy {

	@Override
	public int calculatePriceWithDiscount(int price) {
		// TODO Auto-generated method stub
		return (int) Math.round(price * 0.95);
	}

}
