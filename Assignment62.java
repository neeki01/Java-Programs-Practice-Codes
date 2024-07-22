package assignementBatch42;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		try {
			System.out.println("Enter AGE:");
			int age=s1.nextInt();
			
			System.out.println("Enter Name");
			String name=s1.next();
			
			System.out.println("Enter Salary");
			double salary=s1.nextDouble();
			
			System.out.println("Enter your wt");
			float wt=s1.nextFloat();
			
			System.out.println("Are you student?");
			boolean student=s1.nextBoolean();
		}
		catch(InputMismatchException a1)
		 {
			System.out.println("Fill form again:--"); 
			Scanner s2=new Scanner(System.in);
			System.out.println("Enter valid AGE:");
			int age=s2.nextInt();
			//System.out.println("Age is: "+age);
			
			Scanner s3=new Scanner(System.in);
			System.out.println("Enter valid name:");
			String name=s3.next();
			//System.out.println("Name is: "+name);
			
			Scanner s4=new Scanner(System.in);
			System.out.println("Enter Salary:");
			double salary=s4.nextDouble();
			//System.out.println("Salary is: "+salary);
			
			Scanner s5=new Scanner(System.in);
			System.out.println("Enter your wt");
			float wt=s5.nextFloat();
			//System.out.println("weight is :"+wt);
			
			Scanner s6=new Scanner(System.in);
			System.out.println("Are you student");
			boolean student=s6.nextBoolean();
			//System.out.println("Student or not: "+student);
			
		 }
		System.out.println("FORM is filled successful");
		
	}

}
