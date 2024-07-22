package assignementBatch42;

public class Assignment10LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6;
		int b=10;
		if(a>5 || b==a)
		{
			System.out.println("OR Condition is fulfilled");
		}
		if(a==b && b==6)
		{
			System.out.println("AND Condition is fulfilled");
		}
		if(!(a>5 || b==a))
		{
			System.out.println("NOT OR Condition is fulfilled");
		}
		if(!(a==b && b==6))
		{
			System.out.println("NOT AND Condition is fulfilled");
		}
	}

}
