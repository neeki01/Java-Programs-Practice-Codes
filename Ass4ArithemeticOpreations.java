package assignementBatch42;

public class Ass4ArithemeticOpreations {

	static void add()
	{
		int a = 10;
		int sum=0;
		int b=20;
		sum= a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int a=30;
		int b=10;
		int sub=0;
		sub=a-b;
		System.out.println(sub);
	}
	static void multiply()
	{
		int a=78;
		int b=67;
		int mul=0;
		mul=a*b;
		System.out.println(mul);
	}
	static void div()
	{
		int a=15;
		int b=3;
		int div=0;
		div=a/b;
		System.out.println(div);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Addition");
		add();
		System.out.println("Subtraction");
		sub();
		System.out.println("multiplication");
		multiply();
		System.out.println("Division");
		div();
		
	}

}
