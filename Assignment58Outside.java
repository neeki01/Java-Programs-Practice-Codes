package assignmentBatch42part1;

public class Assignment58Outside {

	public Assignment58Outside()
	{
		System.out.println("Public constructor");
	}
	private Assignment58Outside(int a)
	{
		System.out.println("Private constructor");
	}
	protected Assignment58Outside(char b)
	{
		System.out.println("Protected constroctor");
	}
	void Assignment58Outside(double d)//default access 
	{
		System.out.println("Default constructor");
	}

}
