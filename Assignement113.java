/*Write a program on ArrayList Methods of get() , Set() , Indexof()*/
package assignementBatch42;

import java.util.*;

public class Assignement113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("Neeki");//adding data in arraylist
		a1.add("Kumari");//can store hetrogeneous data
		a1.add("Pihu");
		a1.add("Singh");
		a1.add(null);
		a1.add("Aarna ");
		a1.add("Singh");
		a1.add(null);
		a1.add(23);
		a1.add(852);
		a1.add(78);
		System.out.println(a1);
		System.out.println(a1.get(0));
		System.out.println(a1.set(5,"numb" ));
		System.out.println(a1.set(9, 5665));
		System.out.println(a1);
		System.out.println(a1.indexOf("Singh"));
		System.out.println(a1.indexOf(null));
		
	}

}
