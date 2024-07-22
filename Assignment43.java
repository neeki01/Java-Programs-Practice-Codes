package assignementBatch42;
class superclass01
{
	void add()
	{
		int a=10;
		int b=50;
		int c=0;
		c=a+b;
		System.out.println("Addtiton--"+c);
	}
}
public class Assignment43 extends superclass01{
	void add()
	{
		super.add();
		int a=10;
		int b=20;
		int c=0;
		c=a+b;
		System.out.println("Addtiton--"+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment43 a1=new Assignment43();
		a1.add();

	}

}
