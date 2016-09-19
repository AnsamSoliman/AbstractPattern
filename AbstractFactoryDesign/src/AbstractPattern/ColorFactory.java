package AbstractPattern;

public class ColorFactory extends AbstractFactory {

	Color getColor(String color) {
		// TODO Auto-generated method stub
		
	if(color==null)return null;
	if(color.equalsIgnoreCase("gold"))return new Gold();
	if(color.equalsIgnoreCase("silver"))return new Silver();
	if(color.equalsIgnoreCase("pink"))return new Pink();
	return null;
	
		
	}

	MacType getType(String type) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
