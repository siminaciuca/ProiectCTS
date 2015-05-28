package DesignPatterns;

public class DecoratorCaptuseala extends ArticolDecorator{

	public DecoratorCaptuseala(Articol decoratedArticol) {
		super(decoratedArticol);
		// TODO Auto-generated constructor stub
	}
	
	public int getPrice(){
		return decoratedArticol.getPrice() + 190;
	}
}
