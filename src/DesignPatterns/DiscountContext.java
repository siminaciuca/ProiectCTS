package DesignPatterns;

public class DiscountContext {
	private Strategy strategy;
	public void setDiscountStrategy(Strategy strategy){
		this.strategy = strategy;
	}
	public int getPriceWithDiscount(int price){
		return strategy.calculatePriceWithDiscount(price);
	}
}
