package day3;

public class ex3 {
	static int data=30;
	static class inner{
		void msg()
		{
			System.out.println("data is " + data);
		}
		static void msg2()
		{
			System.out.println("data is"+data);
		}
	}
	public static void main(String[] args) {
		ex3.inner obj=new ex3.inner();
		obj.msg();
		ex3.inner.msg2();
		
	}

}
