//PLease use backward iteration using listiterator for arraylist without farward iteration and note down the error
package assignementBatch42;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("Neeki");
		a1.add("Ashmita");
		a1.add("Rahul");
		a1.add("Sumit");
		a1.add("Suraj");
		a1.add("Ria");
		//System.out.println(a1);
		ListIterator il=a1.listIterator();
		
		while(il.hasPrevious())
		{
			System.out.println(il.previous());
		}
	}

}
