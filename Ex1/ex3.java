package tarProg;
import java.util.*;
public class ex3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		int n=(int)(Math.random()*((max-min)+1))+min; 
		System.out.println(Math.pow(n, 2));
		System.out.println(Math.pow(n, 3));
		System.out.println(Math.pow(n, 0.5));
	}
}
