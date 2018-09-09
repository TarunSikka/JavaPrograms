package day4;

public class Circle extends GeometricObject{
	private double radius;
	public Circle()
	{}
	public Circle(double r)
	{
		radius=r;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius) {
		
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	public double getPerimeter()
	{
		return 2*3.14*radius;
	}
	public String toString()
	{
		return "Circle";
	}
}
