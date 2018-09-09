package day4;

interface Showable{
	void show();
	interface Message{
		void msg();
	}
}
class exer2 implements Showable.Message{
	public void msg()
	{
		System.out.println("Hello nested interface");
	}
	public static void main(String[] args) {
		Showable.Message message=new exer2();
		message.msg();
		

	}

}
