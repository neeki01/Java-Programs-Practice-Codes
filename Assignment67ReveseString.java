package assignementBatch42;

public class Assignment67ReveseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="I am learning";
		String reverse="";
		String name=input.toLowerCase();
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char ch=name.charAt(i);
			reverse=reverse+ch;
		}
		System.out.println("Reverse string is-->"+ reverse);
	}

}
