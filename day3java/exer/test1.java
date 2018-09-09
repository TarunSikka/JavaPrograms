package day3;

public class test1 {
	
	static void fun2(String str,int ...n)
	{
		System.out.println("String:"+str);
		System.out.println("Number of arg"+n.length);
		for(int i:n)
		{
			System.out.print(i+"");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		fun2("GFG",100);
		fun2("ABC",1,2,3,4);
		fun2("SI");

	}

}
