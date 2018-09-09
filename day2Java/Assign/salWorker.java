package day2;

public class salWorker extends worker {

	int sal;
	salWorker(String nam,int salary)
	{
		name=nam;
		sal=salary;
	}
	int pay()
	{
		return sal;
	}
	public void display()
	{
		System.out.println("Name "+name+" Salary "+sal);
	}
}
