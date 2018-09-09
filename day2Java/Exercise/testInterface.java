package day2;

interface Printable{
	void print();
}
interface Showable extends Printable
{
	void show();
}
public class testInterface {
	
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.print("Show");
	}
	public static void main(String[] args) {
		testInterface obj=new testInterface();
		obj.print();
		obj.show();

	}

}
