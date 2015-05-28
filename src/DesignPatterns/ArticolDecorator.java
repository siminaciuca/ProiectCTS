package DesignPatterns;

public abstract class ArticolDecorator implements Articol{
	protected Articol decoratedArticol;
	
	public ArticolDecorator(Articol decoratedArticol){
		this.decoratedArticol = decoratedArticol;
	}
	
	public int getPrice(){
		return decoratedArticol.getPrice();
	}
}
