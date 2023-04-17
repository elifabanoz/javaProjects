package ex;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius=1.0;
		color="red";
		
	}
	
	public Circle(double r, String c) { 
	  this.radius=r;
	  this.color=c;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getRadius() {
		return radius;
	}
	
    public void setRadius(double newRadius) {
    	radius=newRadius;
    }
    
    public void setColor(String newColor) {
    	color=newColor;
    }
    
	public double getArea() {
	double area= radius*radius*Math.PI;
		return area;
	}
}
