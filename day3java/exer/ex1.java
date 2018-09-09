package day3;

public class ex1 {
	
	int rn;
	static String cllg="IET";
	static void changr()
	{
		cllg="Iet Lko";
	}
	ex1(int r)
	{
		rn=r;
	}
	void display()
	{
		System.out.println(rn+" "+cllg);
	}
	
	public static void main(String[] args) {
		ex1 obj1=new ex1(11);
		ex1 obj2=new ex1(22);
		obj1.display();
		ex1.changr();
		obj1.display();
		obj2.display();

	}

}
