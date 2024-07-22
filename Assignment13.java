package assignementBatch42;

public class Assignment13 {
	void add()
	{
		System.out.println("I am nonstatic method");
		int a=10;
		int b=10;
		int c=0;
		c=a+b;
		System.out.println(c);
	}
	 void add(int a, int b)
	{
		System.out.println("I am Argumented nonStatic method");
		int c=0;
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment13 a1=new Assignment13();
		a1.add();
		a1.add(10,65);
	}

}
