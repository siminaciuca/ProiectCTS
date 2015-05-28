package DesignPatterns;

public class DecoratorAplicatii extends ArticolDecorator{

	public DecoratorAplicatii(Articol decoratedArticol) {
		super(decoratedArticol);
		// TODO Auto-generated constructor stub
	}
	
	public int getPrice(){
		return decoratedArticol.getPrice() + 210;
	}
}
