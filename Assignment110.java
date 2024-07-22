//WAP- Iterator in concept of Linklist
package assignementBatch42;

import java.util.Iterator;
import java.util.LinkedList;

public class Assignment110 {

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
		Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
