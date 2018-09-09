package day2;

public class ex6 {

	void sum(int a,int b)
		{System.out.println("Sum"+(a+b));}
	void sum(int a,int b,int c)
		{System.out.print("Sum"+(a+b+c));}
	public static void main(String[] args) {
		ex6 obj=new ex6();
		obj.sum(4, 5);
		obj.sum(4, 5, 6);

	}

}
