package day2;

public class account {
	private String name,type;
	private long acno,bal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getAcno() {
		return acno;
	}
	public void setAcno(long acno) {
		this.acno = acno;
	}
	public long getBal() {
		return bal;
	}
	public void setBal(long bal) {
		this.bal = bal;
	}
	void deposit(int dep)
	{
		bal=bal+dep;
	}
	void withdraw(int wdraw)
	{
		bal=bal-wdraw;
	}
	void display()
	{
		System.out.println("Name "+name);
		System.out.println("Balance "+bal);
	}
	public static void main(String args[])
	{
		currAcc ca1=new currAcc();
		savingAcc sa1=new savingAcc();
		ca1.setName("Raghav");
		ca1.setAcno(5441454);
		ca1.setBal(1000000);
		ca1.setType("Current");
		ca1.display();
		ca1.withdraw(1400);
		System.out.println("Amount of current after withdrawl");
		ca1.display();
		
		sa1.setName("John");
		sa1.setAcno(544654);
		sa1.setBal(140000);
		sa1.setType("Savings");
		sa1.display();
		sa1.withdraw(1400);
		System.out.println("Amount of savings after withdrawl");
		sa1.display();
		System.out.println("Interest on savings "+sa1.calInt(4));
	}

}
