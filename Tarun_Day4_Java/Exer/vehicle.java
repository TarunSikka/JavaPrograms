package day4;

public abstract class vehicle {
	private String engine;
	private String color;
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	abstract public void startEngine();
	abstract public void stopEngine();
	abstract public void move();
	
}
