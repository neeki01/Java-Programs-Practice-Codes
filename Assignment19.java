package assignementBatch42;

public class Assignment19 {
	static int a;
	static int b;
	void add()
	{
		int c=0;
		c=a+b;
		System.out.println("sum is "+ c);
	}
	void sub()
	{
		int c=0;
		c=a-b;
		System.out.println("sub is "+ c);
	}
	void mul()
	{
		int c=0;
		c=a*b;
		System.out.println("mul is "+ c);
	}
	void div()
	{
		int c=0;
		c=a/b;
		System.out.println("div is "+ c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment19 a1=new Assignment19();
		a=50;
		b=30;
		
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}

}
