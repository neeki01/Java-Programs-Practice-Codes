package assignementBatch42;

import java.util.LinkedList;

public class Assignment112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add("Rahul");
		l1.add("Vijay");
		l1.add("Sanyukta");
		l1.add("Gopal");
		l1.add(12);
		l1.add(18);
		l1.add(15);
		l1.add(89);
		l1.add('F');
		l1.add('A');
		l1.add(null);
		l1.add(null);
		l1.add(true);
		System.out.println(l1);
		
		l1.addFirst("PINKY");
		l1.addLast("RANI");
		System.out.println(l1);
		
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		l1.removeFirst();
		System.out.println(l1);
		
		l1.removeLast();
		System.out.println(l1);
		
		l1.pollFirst();
		System.out.println(l1);
		
		l1.pollLast();
		System.out.println(l1);
	}

}
