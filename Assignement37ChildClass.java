package assignementBatch42;
class ParentClass {

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
public class Assignement37ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignement37ChildClass c1=new Assignement37ChildClass();
		c1.add();
		sub();
	}

}
