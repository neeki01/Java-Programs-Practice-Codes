package assignementBatch42;

import java.util.Arrays;

public class Assignment71 {
	static int count_digit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="manual testing batch 42####@@@";
		
		char[] ch=s1.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<s1.length();i++)
		{
			//boolean digit=Character.isDigit(ch[i]);
			if(Character.isDigit(ch[i])==true)
			{
				count_digit++;
			}
			
		}
		System.out.println("Number of digit:"+ count_digit);
	}

}
