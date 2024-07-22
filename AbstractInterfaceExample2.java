package abstractInterfaceAssginement;

interface InterfaceExample01
{
	void login();
	void logout();
	abstract void neeki();
}

abstract class AbsttactExample01 
{
	abstract void morning();
	abstract void night();
	void afternoon()
	{
		System.out.println("AFTERNOON");
	}
	void evening()
	{
		System.out.println("EVENING");
	}
	
}

public class AbstractInterfaceExample2 extends AbsttactExample01 implements InterfaceExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void morning() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void night() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void neeki() {
		// TODO Auto-generated method stub
		
	}

}
