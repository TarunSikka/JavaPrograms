import java.util.*;

public class lamb
{
	
	
	public static void main(String args[])
{
	String W[]={"arrrrrr","ar","arr","arra","array"};

	Arrays.sort(W, (a, b)->Integer.compare(a.length(), b.length()));
	System.out.println(Arrays.toString(W));
}

}