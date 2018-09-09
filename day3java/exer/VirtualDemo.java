package day3;

public class VirtualDemo {

	public static void main(String[] args) {
		Salary s=new Salary("Kiki","Gymkhana",31,3642.00);
		Employee e=new Salary("Bryan","Paras",123,4584.00);
		System.out.println("Call mailCheck using salary ref--");
		s.mailCheck();
		System.out.println("\n Call mailCheck using emp ref");
		e.mailCheck();
}

}
