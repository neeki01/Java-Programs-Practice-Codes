package assignementBatch42;

public class Assignment73 {
	static int count_space;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="manual testing batch 42####@@@";
		char[] ch=s1.toCharArray();	
		
		for(int i=0;i<s1.length();i++)
		{
			//boolean answer=Character.isSpaceChar(ch[i]);
			if(Character.isSpaceChar(ch[i])==true)
			{
				count_space++;
			}
		}
		System.out.println("Number of Space-->"+count_space);
	
	}

}
