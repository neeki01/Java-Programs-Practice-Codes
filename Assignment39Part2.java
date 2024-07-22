package assignementBatch42;
class GrandParent02
{
	GrandParent02(char b)
	{
		System.out.println("I am grantparent Constructor");
	}
}
class Parent02 extends GrandParent02
{
	Parent02(String b)
	{
		super('N');
		System.out.println("I am Parent Constructor");
	}
}
public class Assignment39Part2 extends Parent02{

	Assignment39Part2()
	{
		super("Neeki");
		System.out.println("I am Child Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment39Part2();
				
	}

}
