package assignementBatch42;

import java.util.Scanner;

public class Assignment35 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=Math.PI;
		
		System.out.println("Enter the radius:--");
		Scanner s1=new Scanner(System.in);
		double radius=s1.nextDouble();
		
		double circumference_circle=0.0;
		circumference_circle=2*radius*pi;
		System.out.println("Area of rectangle is: " +circumference_circle );
	}

}
