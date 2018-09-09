package tarProg;
import java.util.Scanner;
public class asgn1 {
	public static void main(String args[])
	{
		//without using third var
		int a=2;
		int b=3;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a+" b: "+b);
		//using third var
		int c=3;
		int d=4;
		int temp=c;
		c=d;
		d=temp;
		System.out.println("c: "+c+" d: "+d);
		
	}
}
