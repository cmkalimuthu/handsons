package abstractFactory;

public class FactoryGetter {

	public Factory getFactory(String name) {
		if(name==null)
			System.out.println("no factory selected");
		else if(name.equalsIgnoreCase("MERCEDES"))
			return new MercedesFactory();
		else if(name.equalsIgnoreCase("AUDI"))
			return new AudiFactory();
		
		return null;
		
	}
}
