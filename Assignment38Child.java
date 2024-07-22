package assignementBatch42;
class GrandParent {
	void mul()
	{
		int a=10;
		int b=20;
		int c=0;
		c=a*b;
		System.out.println("mul is-->"+c);
	}
	static void div()
	{
		int a=10;
		int b=20;
		int c=0;
		c=a/b;
		System.out.println("div is-->"+c);
	}
}
class Parent extends GrandParent{
	void add()
	{
		int a=10;
		int b=20;
		int c=0;
		c=a+b;
		System.out.println("sum is-->"+c);
	}
	static void sub()
	{
		int a=10;
		int b=20;
		int c=0;
		c=a-b;
		System.out.println("sub is-->"+c);
	}
}

public class Assignment38Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub();
		div();
		Assignment38Child a1=new Assignment38Child();
		a1.add();
		a1.mul();
	}

}
