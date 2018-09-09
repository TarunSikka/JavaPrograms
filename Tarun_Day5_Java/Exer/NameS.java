package day5;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class NameS {
public static void main(String[] args) {
	Comparaexa nameArray[]={new Comparaexa("jhon", "smith"),
	new Comparaexa("Karl", "Ng"),
	new Comparaexa("Jeff", "smith"),
	new Comparaexa("Tom", "smith"),};
	List<Comparaexa> names=Arrays.asList(nameArray);
Collections.sort(names);	
System.out.println(names);
}
}
