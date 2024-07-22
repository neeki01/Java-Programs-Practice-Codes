package assignementBatch42;

import java.util.Arrays;

public class Assignment69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno[]=new int[5];
		rollno[0]=1;
		rollno[1]=2;
		rollno[2]=46;
		rollno[3]=15645;
		rollno[4]=56;
		try
		{
			rollno[5]=65;
			
		}
		catch(ArrayIndexOutOfBoundsException a) {
			//System.out.println(Arrays.toString(rollno));
		}
		System.out.println(Arrays.toString(rollno));
		
		String name[]=new String [5];
		name[0]="nk";
		name[1]="bj";
		name[2]="dd";
		name[3]="dfcsw";
		name[4]="dcw";
	
			
		System.out.println(Arrays.toString(name));
	}

}
