package day5;

import java.util.Vector;

public class Basic {
public static void main(String[] args) {
	Vector<String> vct=new Vector<>();
	vct.add("FIRST");
	vct.add("third");
	vct.add("second");
	System.out.println(vct);
	vct.add(2,"Random");
	System.out.println("element "+vct.get(3));
	System.out.println(vct.firstElement());
	System.out.println(vct.lastElement());
	System.out.println(vct.isEmpty());
	
	
	
}
}
