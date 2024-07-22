package assignementBatch42;

public class Assignment68Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="Radar";
		String name=n.toLowerCase();
		String input="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char c=name.charAt(i);
			input=input+c;
		}
		System.out.println(input);
		
		if(name.equals(input))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
	}

}
