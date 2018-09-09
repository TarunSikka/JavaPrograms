class bi
{
	int sp=0;
	int g=1;
	void cg(int nv)
	{
		g=nv;
	}
	void pd()
	{
	System.out.println("Gear "+g);
	}
}

class biDemo
{
	public static void main(String args[])
{
	bi obj=new bi();
	obj.cg(5);
	obj.pd();
}
}
