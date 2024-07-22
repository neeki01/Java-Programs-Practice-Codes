package assignementBatch42;

public class Assignement12 {
	static void add()
	{
		System.out.println("I am static method");
		int a=10;
		int b=10;
		int c=0;
		c=a+b;
		System.out.println(c);
	}
	static void add(int a, int b)
	{
		System.out.println("I am Argumented static method");
		int c=0;
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(10,30);
	}

}
