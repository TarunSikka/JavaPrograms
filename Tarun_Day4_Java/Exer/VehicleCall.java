package day4;

public class VehicleCall {

	public static void main(String[] args) {
		Car car=Car.getInstance();
		Boat boat=Boat.getInstance();
		
		car.startEngine();
		car.move();
		car.stopEngine();
		
		boat.startEngine();
		boat.move();
		boat.stopEngine();
		
		
		
	}

}
