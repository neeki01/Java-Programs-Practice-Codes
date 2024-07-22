package assignementBatch42;

import java.util.ArrayList;
//WAP using Iterator
//(process of iteration through
//		 iterable )
import java.util.Iterator;

public class Assignment105 {

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
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
