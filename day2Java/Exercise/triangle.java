package day2;

public class triangle extends shape {
	private int base=8;
	private int height=7;
	
	int getArea()
	{
		return (int)(0.5*base*height);
	}
	
	void tostring()
	{
		System.out.println("base "+base);
		System.out.println("height "+height);
		System.out.println("Area "+getArea());
	}
	public static void main(String args[])
	{
		triangle obj=new triangle();
		obj.tostring();
	}

}
