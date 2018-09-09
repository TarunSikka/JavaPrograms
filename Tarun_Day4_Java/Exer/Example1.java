interface GreetingService{
	void sayMessage(String message);
}
public class Example1 {

	public static void main(String[] args) {
		GreetingService greetService1=message->System.out.println("Hello "+message);
		greetService1.sayMessage("World");

	}

}
