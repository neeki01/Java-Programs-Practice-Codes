package assignementBatch42;

import java.util.Scanner;

public class Assignment56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.print("Choose first number:-");
		int a=s1.nextInt();
		System.out.print("Choose second number:-");
		int b=s1.nextInt();
		int c=0;
		
		System.out.println("Enter you choice: 1.Add, 2.Sub, 3.Division, 4.Multiplication:--");
		int d=s1.nextInt();
		switch(d)
		{
		case 1:
			c=a+b;
			System.out.println("Addition result:"+ c);
			break;
		case 2:
			c=a-b;
			System.out.println("Substraction result:"+ c);
			break;
		case 3:
			c=a/b;
			System.out.println("Division result:"+ c);
			break;
		case 4:
			c=a*b;
			System.out.println("Multiplication result:"+ c);
		default:
			System.out.println("Selection is out of range");
				
		}
	}

}
