package DesignPatterns;

public class DecoratorNasturi extends ArticolDecorator {

	public DecoratorNasturi(Articol decoratedArticol) {
		super(decoratedArticol);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice(){
		//adaugam si taxa de 120 de lei pentru nasturi
		return decoratedArticol.getPrice() + 120;
	}
}
