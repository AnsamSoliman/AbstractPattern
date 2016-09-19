package AbstractPattern;

public  class TypeFactory extends AbstractFactory {

	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	MacType getType(String type) {
		// TODO Auto-generated method stub
		if(type.equalsIgnoreCase("imac"))return new iMAC();
		if(type.equalsIgnoreCase("ipad"))return new iPad();
		if(type.equalsIgnoreCase("iphone"))return new iPhone();
		
		return null;
	}

}
