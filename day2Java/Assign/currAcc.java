package day2;

public class currAcc extends account{
	void withdraw(int wdraw)
	{
		setBal(getBal()-wdraw);
		if(getBal()<25000)
			setBal(getBal()-10000);
	}
	
}
