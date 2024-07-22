//WAP using Collection methods
package assignementBatch42;

import java.util.ArrayList;

public class Assignment101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		a1.add("Neeki");//adding data in arraylist
		a1.add("Kumari");//can store hetrogeneous data
		a1.add(23);
		a1.add('t');
		a1.add(null);
		a1.add(" ");
		a1.add("Neeki");//accept duplicate vale
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Ram");
		System.out.println(a2);
		
		System.out.println(a2.contains("Ram"));
		System.out.println(a2.containsAll(a1));
		
		System.out.println(a2.isEmpty());
		
		ArrayList a3=new ArrayList();
		System.out.println(a3.isEmpty());
		
		
		

	}

}
