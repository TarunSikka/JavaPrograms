package tarProg;
import java.util.*;
public class assgn4 {
static int a,b;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 a=sc.nextInt();
		 b=sc.nextInt();
		 assgn4 obj= new assgn4();
		swap(obj);
		System.out.println("Swapped values.. a "+a+" b "+b);
	}
	
	public static void swap(assgn4 ob)
	{
		
		int temp=0;
		temp=ob.a;
		ob.a=ob.b;
		ob.b=temp;
	}

}
