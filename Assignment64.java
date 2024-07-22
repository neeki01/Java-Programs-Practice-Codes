package assignementBatch42;

public class Assignment64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int c=1/0;
			System.out.println(c);
			
			}
			catch(ArithmeticException b)
			{
				System.out.println("Handlening execption");
			}
			catch(NullPointerException d)
			{
				System.out.println("Handlening execption null pointer");
			}
		finally
		{
			System.out.println("Get always execption");
		}
	}

}
