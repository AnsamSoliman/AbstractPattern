package AbstractPattern;

public class AbstractPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory af=ProducerFactory.getFactory("type");
		MacType mt=af.getType("iphone");
		mt.print();
		
		AbstractFactory aff=ProducerFactory.getFactory("color");
		Color c=aff.getColor("pink");
		c.fill();
		
		AbstractFactory af2=ProducerFactory.getFactory("type");
		MacType mt2=af.getType("imac");
		mt2.print();
		
		AbstractFactory aff2=ProducerFactory.getFactory("color");
		Color c2=aff.getColor("silver");
		c2.fill();
		

	}

}
