package assignementBatch42;

public class Assignment17 {
	static int a=10;
	int b=10;
	void add() 
	{
		int a=10;
		System.out.println("I am local "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment17 a1=new Assignment17();
		
		a1.add();
		System.out.println(a1.b=30);
		a=90;
		System.out.println("I am Glbal "+a);
		
	}

}
