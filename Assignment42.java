package assignementBatch42;
class superclass
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
public class Assignment42 extends superclass{

	void add()
	{
		int a=10;
		int b=20;
		int c=0;
		c=a+b;
		System.out.println("Addtiton--"+c);
	}
	public static void main(String[] args) {
		Assignment42 a1=new Assignment42();
		a1.add();
	
	}

}
