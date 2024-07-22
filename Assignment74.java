package assignementBatch42;

import java.util.Arrays;

public class Assignment74 {
		static int count_digit;
		static int count_letter;
		static int count_space;
		static int count_specialChar;
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
			if(Character.isSpaceChar(ch[i])==true)
			{
				count_space++;
			}
			if(Character.isLetter(ch[i])==true)
			{
				count_letter++;
			}
		}
		count_specialChar=s1.length()-(count_digit+count_space+count_letter);
		System.out.println("Number of digit:"+ count_digit);
		System.out.println("Number of space:"+ count_space);
		System.out.println("Number of alphabets:"+ count_letter);
		System.out.println("Number of specialcharaters:"+ count_specialChar);
	}

}
