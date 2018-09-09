package day3;

public class tsetClass {

	public static void main(String[] args) {
		age ob= new age();
		ob.setDay(1);
		ob.setMonth(1);
		ob.setYear(1992);
		
		immmutableStu stu=new immmutableStu(1,"alex",ob);
		
		System.out.println("Alex age year before modification="+stu.getAge().getYear());
		stu.getAge().setYear(1993);
		System.out.println("Alex age year after modification="+stu.getAge().getYear());
	}

}
