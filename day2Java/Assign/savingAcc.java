package day2;

public class savingAcc extends account{
	int interest;
	public int calInt(int t)
	{
		setBal(getBal()+(int)((getBal()*0.4*t)/100));
		return (int)((getBal()*0.4*t)/100);
		
	}
}
