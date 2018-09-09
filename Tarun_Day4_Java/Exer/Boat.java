package day4;

public class Boat extends vehicle{
	@Override
	public void startEngine()
	{
		System.out.println("Boat engine started");
	}
	@Override
	public void stopEngine()
	{
		System.out.println("Boat engine stopped");

	}
	@Override
	public void move()
	{
		System.out.println("Boat moved");
	}
	
	public static Boat getInstance()
	{
		return new Boat();
	}
}
