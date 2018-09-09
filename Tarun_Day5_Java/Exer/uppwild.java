package day5;

import java.util.Arrays;
import java.util.List;


public class uppwild {
public static void main(String[] args) {
	List<Integer> list1=Arrays.asList(4,5,6,7);
	sum(list1);
	List<Number> list2=Arrays.asList();
	sum(list2);

}
public static void sum(List<? super Integer> list)
{
/*double sum=0.0;
for(Number i:list)
{
	sum+=i.doubleValue();
}
return sum;*/
	System.out.println(list);
}
}
