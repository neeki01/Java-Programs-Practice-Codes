//Write a program in Methods of Linkedlist
//addFirst, addLast, getFirst, getLast, removeFirst, removeLast, pollFirst and pollLast
package assignementBatch42;

import java.util.Collections;
import java.util.LinkedList;

public class Assignement112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		
		l1.add(89);
		l1.addFirst("Neeki");
		l1.add(54);
		l1.addLast(null);
		l1.add(23);
		l1.addLast("kumari");
		l1.add("Neeki");
		l1.add("kumari");
		l1.add(900);
		//l1.addFirst(89);
		l1.add(null);
		l1.add("Pihu");
		l1.add(66);
		//Collections.sort(l1);
		
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		l1.removeFirst();
		l1.removeLast();
		
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		//l1.poll();
		System.out.println(l1);
		l1.pollFirst();
		System.out.println(l1);
		l1.pollLast();
		System.out.println(l1);
		
		//System.out.println(l1.get(3));
	}

}
