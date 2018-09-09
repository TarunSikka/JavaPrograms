package day3;

public class Singleton {
	private static Singleton single_instance=null;
	public String s;
	private Singleton()
	{
		s="Hello i am string";
	}
	public static Singleton getInstance()
	{
		if(single_instance==null)
			single_instance= new Singleton();
		return single_instance;
	}
}
