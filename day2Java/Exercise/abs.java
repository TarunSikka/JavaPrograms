package day2;

interface A{
		void a();
		void c();
		void d();
		
}
abstract class B implements A{
	public void c()
	{
		System.out.println("I am C");
	}
}
class M extends B{
	public void a()
	{
		System.out.println("I am A");
	}
	public void d()
	{
		System.out.println("I am D");
	}
}
public class abs {

	public static void main(String[] args) {
		A a= new M();
		a.a();
		a.c();
		a.d();
		

	}

}
