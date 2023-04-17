package ex;

public class TestCircle {

	public static void main(String[] args) {
		
	Circle c4= new Circle();
	c4.setRadius(5.5);
	System.out.println("radius is:" + c4.getRadius());
	
	c4.setColor("green");
	System.out.println("color is:" + c4.getColor());
	
	Circle c6= new Circle();
	System.out.println("radius is:" + c6.getRadius()); // return default value
	System.out.println("color is:" + c6.getColor()); // return default value
	

	}

}
