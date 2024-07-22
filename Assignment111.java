//WAP- Iterator in concept of ListIterator
package assignementBatch42;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assignment111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add("Neeki");
		l1.add("Ashmita");
		l1.add("Rahul");
		l1.add("Sumit");
		l1.add("Suraj");
		l1.add("Ria");
		System.out.println(l1);
		
		ListIterator a=l1.listIterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
		while(a.hasPrevious())
		{
			System.out.println(a.previous());
		}
		
		
	}

}
