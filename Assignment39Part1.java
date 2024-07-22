package assignementBatch42;
class GrandParent01
{
	GrandParent01()
	{
		System.out.println("I am grantparent Constructor");
	}
}
class Parent01 extends GrandParent01
{
	Parent01()
	{
		System.out.println("I am Parent Constructor");
	}
}
public class Assignment39Part1 extends Parent01{

	Assignment39Part1()
	{
		super();
		System.out.println("I am Child Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment39Part1();
	   //new Parent01();
	   
	}

}
