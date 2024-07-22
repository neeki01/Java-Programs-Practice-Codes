package assignementBatch42;

import java.util.Arrays;

public class Assognment81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]=new int[5];
		no[0]=77;
		no[1]=72;
		no[2]=16;
		no[3]=6;
		no[4]=12;
		
		int k=0;
		int reverse[]=new int[no.length];
				
		for(int i=no.length-1;i>=0;i--)
		{
			
			reverse[i]=no[k];
			k++;
		}
		System.out.println(Arrays.toString(no));
		
		System.out.println(Arrays.toString(reverse));
	}

}
