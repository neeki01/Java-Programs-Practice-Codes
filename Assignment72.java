package assignementBatch42;

import java.util.Arrays;

public class Assignment72 {
	static int count_letter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="manual testing batch 42####@@@";
		
		char[] ch=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<s1.length();i++)
		{
			//boolean answer=Character.isLetter(ch[i]);
			if (Character.isLetter(ch[i])==true)
			{
				count_letter++;
			}
		}
		System.out.println("Number of Alphabets-->"+ count_letter);
		
	}

}
