package day2;

public class rectangle extends shape {

	int length=4,width=5;
	public int getArea()
	{
		return length*width;
	}
	public void tostring()
	{
		System.out.println("length "+length);
		System.out.println("width "+width);
		System.out.println("Area "+getArea());
	}
	public static void main(String args[])
	{
		rectangle obj=new rectangle();
		obj.tostring();
	}

}
