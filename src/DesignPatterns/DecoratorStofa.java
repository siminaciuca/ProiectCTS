package DesignPatterns;

public class DecoratorStofa extends ArticolDecorator{

	public DecoratorStofa(Articol decoratedArticol) {
		super(decoratedArticol);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice(){
		//intoarcem pretul articolului (ce poate fi deja decorat) + taxa de stofa de 250 de lei
		return decoratedArticol.getPrice() + 250;
	}
}
