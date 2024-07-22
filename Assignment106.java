//WAP using ListIterator
package assignementBatch42;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("Neeki");
		a1.add("Ashmita");
		a1.add("Rahul");
		a1.add("Sumit");
		a1.add("Suraj");
		a1.add("Ria");
		System.out.println(a1);
		ListIterator il=a1.listIterator();
		
		while(il.hasNext())
		{
			System.out.println(il.next());
		}
		System.out.println("----------------------------");
		while(il.hasPrevious())
		{
			System.out.println(il.previous());
		}
		System.out.println("-----------------------------");
	}

}
