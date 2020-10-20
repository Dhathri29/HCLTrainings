package day2;

public class Circle {
private double radius;
private String color;
public Circle() {
	super();
	// TODO Auto-generated constructor stub
}
public Circle(double radius) {
	this.radius = radius;
}
public double getArea() {
	return Math.PI*(radius *radius);
}
public void getRadius() {
	System.out.println(radius);
}
}
