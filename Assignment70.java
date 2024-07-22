package assignementBatch42;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter size of array:-->");
		int value=s1.nextInt();
		int rollup[]=new int[value];
		
		System.out.println("Enter Values of array:-->");
		Scanner s2=new Scanner(System.in);
		
		for(int i=0;i<rollup.length;i++)
		{
			rollup[i]=s2.nextInt();
		}
		System.out.println(Arrays.toString(rollup));
	}

}
