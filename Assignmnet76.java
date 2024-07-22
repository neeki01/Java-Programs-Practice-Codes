package assignementBatch42;

public class Assignmnet76 {
	static int sum=0;
	static double avg=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int no[]=new int[4];
			no[0]=77;
			no[1]=72;
			no[2]=15;
			no[3]=6;
			
			
			for(int i=0;i<no.length;i++)
			{
				sum=sum+no[i];
			}
			System.out.println("Sum is-->"+sum);
			avg=sum/no.length;
			System.out.println("Average of value"+avg);
	}

}
