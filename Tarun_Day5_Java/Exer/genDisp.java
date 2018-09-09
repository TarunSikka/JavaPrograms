package day5;

public class genDisp {

	static <T> void genericDisplay(T element){
		System.out.println(element.getClass().getName()+" = "+element);
	}
	public static void main(String[] args) {
		genericDisplay(11);
		genericDisplay("java");
		genericDisplay(1.0);

	}

}
