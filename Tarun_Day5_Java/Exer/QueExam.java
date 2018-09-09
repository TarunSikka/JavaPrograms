package day5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueExam {
public static void main(String[] args) {
	Queue<String> qe=new LinkedList<>();
	qe.add("b");
	qe.add("a");
	qe.add("c");
	Iterator it=qe.iterator();
	System.out.println("intial size of Queue:"+qe.size());
	while(it.hasNext())
	{
		String iteratorValue=(String)it.next();
		System.out.println("Queue Next Value:"+iteratorValue);
	}
	System.out.println("Quee peek:"+qe.peek());
	System.out.println("Quee poll:"+qe.poll());
	System.out.println("First size of Queue:"+qe.size());
	
	
}
}
