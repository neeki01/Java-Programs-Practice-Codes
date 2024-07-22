//WAP on Vector methods
//addElementElements();firstElement();
//lastElement();
//removeElement();
//removeElementAt();
//removeAllElements()
//capacity();
package assignementBatch42;

import java.util.Vector;

public class Assignment114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.addElement("Rahul");
		v.addElement("Vijay");
		v.addElement("Sanyukta");
		v.addElement("Gopal");
		v.addElement(12);
		v.addElement(18);
		v.addElement(15);
		v.addElement(89);
		v.addElement('F');
		v.addElement('A');
		v.addElement(null);
		v.addElement(null);
		v.addElement(true);
	
		System.out.println(v);
		
		v.addElement(6);
		System.out.println(v);
		
		Object o=v.firstElement();
		System.out.println(o);
		
		Object ob=v.lastElement();
		System.out.println(ob);
		
		v.removeElement(ob);
		System.out.println(v);
		
		v.removeElementAt(5);
		System.out.println(v);
		
		v.removeAllElements();
		System.out.println(v);
		
		int i=v.capacity();
		System.out.println(1);
		
	}

}
