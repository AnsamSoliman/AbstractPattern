package AbstractPattern;

public class ProducerFactory {
	public static AbstractFactory getFactory(String factoryType){
		
		if(factoryType.equalsIgnoreCase("Color"))return new ColorFactory();
		
		if(factoryType.equalsIgnoreCase("Type"))return new TypeFactory();
		return null;
		
		
	}

}
