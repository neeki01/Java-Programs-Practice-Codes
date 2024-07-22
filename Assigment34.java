package assignementBatch42;

import java.util.Scanner;

public class Assigment34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculate the area of rectangle 
		
		System.out.println("Enter the lenght:--");
		Scanner s1=new Scanner(System.in);
		double lenght=s1.nextDouble();
		
		System.out.println("Enter the breadth:--");
		double breadth=s1.nextDouble();
		
		double area_rectangle=0.0;
		area_rectangle=lenght*breadth;
		System.out.println("Area of rectangle is: " +area_rectangle );
	}

}
