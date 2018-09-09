package day4;

public class Car extends vehicle {
	@Override
	public void startEngine()
	{
		System.out.println("Car engine started");
	}
	@Override
	public void stopEngine()
	{
		System.out.println("Car engine stopped");

	}
	@Override
	public void move()
	{
		System.out.println("Car moved");
	}
	public static Car getInstance()
	{
		return new Car();
	}
}
