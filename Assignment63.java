package assignementBatch42;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollno[] = new int[4];
		rollno[0]=12;
		rollno[1]=11;
		rollno[2]=45;
		rollno[3]=56;
		
		try
		{
			rollno[4]=90;
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Ooopss......Array exceeded");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input is not matching");
		}
		catch(NullPointerException  e1)
		{
			System.out.println("Null pointer");
		}
		
	}

}
