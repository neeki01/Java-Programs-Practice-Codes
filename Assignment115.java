//WAP on Stack methods
//pop()
//peak()
//push()
package assignementBatch42;

import java.util.Stack;

public class Assignment115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s= new Stack();
		s.push(23);
		s.push("Hi");
		s.push(null);
		s.push(null);
		s.push("Hi");
		s.push(56);
		s.push(true);
		System.out.println(s);
		
		Object o=s.peek();
		System.out.println(o);
		
		Object o1=s.pop();
		System.out.println(o1);
		System.out.println(s);
	}

}
