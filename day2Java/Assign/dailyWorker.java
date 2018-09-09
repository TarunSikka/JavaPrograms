package day2;

public class dailyWorker extends worker{

	 int days;
	 int wage;
	dailyWorker(String nam,int d,int wag)
	{
		name=nam;
		days=d;
		wage=wag;
	}
	int pay()
	{
		return days*wage;
	}
	public void display()
	{
		System.out.println("Name "+name+" days "+days+" wage "+wage);
	}
	

}
