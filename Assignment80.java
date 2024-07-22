package assignementBatch42;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s1=new Scanner(System.in);
//		System.out.println("Enter size of array1:-->");
//		int value=s1.nextInt();
		
		
		
//		
//		System.out.println("Enter Values of array:-->");
//		Scanner s2=new Scanner(System.in);
//		
//		for(int i=0;i<rollup.length;i++)
//		{
//			rollup[i]=s2.nextInt();
//		}
//		
//		Scanner s3=new Scanner(System.in);
//		System.out.println("Enter size of array2:-->");
//		int value1=s3.nextInt();
//		int rollup1[]=new int[value];
//		
//		System.out.println("Enter Values of array:-->");
//		Scanner s4=new Scanner(System.in);
//		
//		for(int i=0;i<rollup.length;i++)
//		{
//			rollup1[i]=s4.nextInt();
//		}
//		
		
		int rollup[]=new int[3];
		rollup[0]=1;
		rollup[1]=2;
		rollup[2]=3;
		
		int rollup1[]=new int[3];
		rollup1[0]=1;
		rollup1[1]=2;
		rollup1[2]=3;
		boolean answer=Arrays.equals(rollup, rollup1);
		System.out.println(answer);
		
	}
}
