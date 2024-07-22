package assignementBatch42;

import java.util.Scanner;

public class Assignment36 {

	static Scanner s1=new Scanner(System.in);
	static void modular()
	{
		
		System.out.println("This is modular code:----");
		System.out.println("Enter number 1--");
		int a=s1.nextInt();
		System.out.println("Enter number 2--");
		int b=s1.nextInt();
		int c=0;
		c=a%b;
		System.out.println("div is-->"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		modular();
	}

}
