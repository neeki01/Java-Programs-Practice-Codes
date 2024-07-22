package assignementBatch42;

public class Assignment15 {
	
	Assignment15()
	{
		System.out.println("Constructor 1");
	}
	Assignment15(int a)
	{
		System.out.println("Constructor 2");
	}
	void add() 
	{
		int a=10;
		int b=12;
		int c=0;
		c=a+b;
		System.out.println(c);
	}
	void add(int a,int b) 
	{
	
		int c=0;
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment15 a1= new Assignment15();
		new Assignment15(12);
		a1.add();
		a1.add(12,3);
		
	}

}
