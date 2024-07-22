package assignementBatch42;

//import getterAndsetter.Google_auth;

class Google_auth
{
	private int age=18;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
		//System.out.println(age);
	}
	private String username="abc@gmail.com";
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
public class Assignment122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Google_auth g1=new Google_auth();
		g1.setAge(89);
		System.out.println(g1.getAge());
		g1.setUsername("xyz@gmail.com");
		System.out.println(g1.getUsername());
		
	}

}
