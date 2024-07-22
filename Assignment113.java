package assignementBatch42;

import java.util.ArrayList;
//WAP on ArrayList Methods of get() , Set() , Indexof()
import java.util.Collections;

public class Assignment113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(45);
		a1.add(89);
		a1.add(12);
		a1.add(14);
		//a1.add(96.0);
		a1.add(50);
		Collections.sort(a1);
		System.out.println(a1);
		
		System.out.println(a1.get(3));
		
		System.out.println(a1.set(2, 45));
		
		int i=a1.indexOf(14);
		System.out.println(i);
	}

}
