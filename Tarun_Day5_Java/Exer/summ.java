package day5;

class Test1<T,U> {
	T obj1;
	U obj2;
	Test1(T obj1, U obj2)
	{
		this.obj1=obj1;
		this.obj2= obj2;
	}
	public void print()
	{
		if((obj1 instanceof Number||obj1 instanceof String)&&(obj2 instanceof Number||obj2 instanceof String))
			System.out.println((Double.parseDouble(obj1.toString()))+(Double.parseDouble(obj2.toString())));
		else 
			System.out.println("Invalid type input");
	}
}
public class summ {

	public static void main(String[] args) {
		Test1 <?,?> obj= new Test1<>("12","13");
		
		obj.print();

	}

}
