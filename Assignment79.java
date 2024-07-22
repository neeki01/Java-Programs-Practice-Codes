package assignementBatch42;

import java.util.Arrays;

public class Assignment79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]=new int[5];
		no[0]=77;
		no[1]=72;
		no[2]=16;
		no[3]=6;
		no[4]=12;
		
		int no1[]=new int[no.length];
		
		for(int i=0;i<no.length;i++)
		{
				no1[i]=no[i];
		}
		System.out.println(Arrays.toString(no1));
	}

}
