package day2;

public class exa1call {

	public static void main(String[] args) {
		exa1 obj= new exa1();
		obj.setAge(24);
		obj.setIdNum("51454474");
		obj.setName("Tarun");
		System.out.print("Name "+obj.getName()+" ID "+obj.getIdNum()+" age "+obj.getAge());
	}

}
