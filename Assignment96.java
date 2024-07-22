//WAP to check if 'n' is present in the middle of given string "automation testing" or not
package assignementBatch42;

public class Assignment96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="automation testing";
		int middle=name.length()/2;
		//System.out.println(middle);
		char ans=name.charAt(middle);
		if(ans=='n') 
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not presen");
		}
		
	}

}
