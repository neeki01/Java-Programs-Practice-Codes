package assignementBatch42;

import java.util.Scanner;

public class Assignment59 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		
		if (age>=18)
		{
			System.out.println("Visit google.com");
		}
		else
		{
			throw new ArithmeticException("You are still young");
		}
		
	}

}
