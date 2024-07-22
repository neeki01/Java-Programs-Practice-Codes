//WAP with split(string regex) & split(string regex, int index)
package assignementBatch42;

import java.util.Arrays;

public class Assignment99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s5="neeki kumari dfdfg dfgfg";
		String s6[]=s5.split(" ");
		System.out.println(Arrays.toString(s6));
		
		String s7[]=s5.split(" ", 2);
		System.out.println(Arrays.toString(s7));
		
	}

}
