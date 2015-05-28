package DesignPatterns;

public class ArticolFactory {
	public static Articol genereazaArticol(String tipArticol){
		if(tipArticol.equalsIgnoreCase("costum barbatesc"))
			return new CostumBarbatesc();
		if(tipArticol.equalsIgnoreCase("costum femeiesc"))
			return new CostumFemeiesc();
		if(tipArticol.equalsIgnoreCase("camasa"))
			return new Camasa();
		if(tipArticol.equalsIgnoreCase("fusta"))
			return new Fusta();
		return null;
	}
}
