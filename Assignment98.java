//WAP with equalsIgnoreCase, endswith, isEmpty, split & Repeat in String Class
package assignementBatch42;

import java.util.Arrays;

public class Assignment98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="AuTomation";
		System.out.println(name.equalsIgnoreCase("automation"));
		
		String s2=" ";
		System.out.println(s2.isEmpty());
		
		String s3="Testing";
		System.out.println(s3.repeat(2));//Repeats the string with number of values provided
		
		String s4="manish";
		System.out.println(s4.endsWith("h"));
		
		
		
	}

}
