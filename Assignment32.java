package assignementBatch42;

import java.util.Scanner;

public class Assignment32 {
	static Scanner s1=new Scanner(System.in);
	
	void add()
	{
		System.out.println("This is additin code:----");
		System.out.println("Enter number 1--");
		int a=s1.nextInt();
		System.out.println("Enter number 2--");
		int b=s1.nextInt();
		int c=0;
		c=a+b;
		System.out.println("sum is-->"+c);
	}
	static void sub()
	{
		System.out.println("This is substraction code:----");
		System.out.println("Enter number 1--");
		int a=s1.nextInt();
		System.out.println("Enter number 2--");
		int b=s1.nextInt();
		int c=0;
		c=a-b;
		System.out.println("sub is-->"+c);
	}
	void mul()
	{
		System.out.println("This is multiplication code:----");
		System.out.println("Enter number 1--");
		int a=s1.nextInt();
		System.out.println("Enter number 2--");
		int b=s1.nextInt();
		int c=0;
		c=a*b;
		System.out.println("mul is-->"+c);
	}
	static void div()
	{
		
		System.out.println("This is division code:----");
		System.out.println("Enter number 1--");
		int a=s1.nextInt();
		System.out.println("Enter number 2--");
		int b=s1.nextInt();
		int c=0;
		c=a/b;
		System.out.println("div is-->"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment32 a1=new Assignment32();
		div();
		sub();
		a1.add();
		a1.mul();
	}

}
