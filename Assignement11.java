package assignementBatch42;

public class Assignement11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=11;
		if(age<1)
		{
				System.out.println("You are infant");
		}
		else if(age<=5 && age>=0 )
		{
			System.out.println("Todler");
			
		}
		else if(age<=10 && age>=5)
		{
			System.out.println("Kid");
		}
		else if(age<=20 && age>=11 )
		{
			System.out.println("Teenage");
		}
		else
		{
			System.out.println("Adult");
		}
	}

}
