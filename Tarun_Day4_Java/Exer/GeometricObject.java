package day4;

import java.util.Date;
public class GeometricObject {
	private String color ;
	private boolean filled;
	private Date dateCreated;
	public GeometricObject() {
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String toString()
	{
		return "This is GO";
	}
	public double getArea()
	{
		return 0.0;
	}
	public double getPerimeter()
	{
		return 0.0;
	}
	
	

}
