package ex;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() { //default constructor
		radius= 1.0;
		color="red";
	}
	public Circle(double r) { //  constructor with one parameter
		radius=r;
		color="red";
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
	double area= radius*radius*Math.PI;
		return area;
	}
}
