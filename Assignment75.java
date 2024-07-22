package assignementBatch42;

import java.util.Arrays;

public class Assignment75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="inch";
		String s2="chin";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("It is not anagram");
		}
		else
		{
			System.out.println("Eligble to be anagram but need to check characters");
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			
			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean answer=Arrays.equals(ch1, ch2);
			if(answer==true)
			{
				System.out.println("Strings are Anagram");
			}
			else
			{
				System.out.println("Strings are not Anagram");
			}
		}
		
	}

}
