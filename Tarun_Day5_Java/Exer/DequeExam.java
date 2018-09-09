package day5;

import java.util.*;

public class DequeExam {
	public static void main(String[] args) {
		Deque<String> deque=new ArrayDeque<>();
		deque.offer("arvind");
		deque.offer("vimal");
		deque.add("mukul");
		deque.offerFirst("jai");
		System.out.println("After offerFirst Traversal....");
		for(String s:deque){
			System.out.println(s);
		}
		deque.pollLast();
		System.out.println("After pollLast() Traversal..");
		for(String s:deque)
		{
			System.out.println(s);
		}
	}
	

}
