package abstractInterfaceAssginement;
interface InterfaceExample
{
	void login();
	void logout();
}

abstract  class AbsttactExample implements InterfaceExample
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

public class AbstractInterfaceAssignement extends AbsttactExample{

	void day()
	{
		System.out.println("DAY");
	}
	
	void dawn()
	{
		System.out.println("DAWN");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AbstractInterfaceAssignement().afternoon();
		new AbstractInterfaceAssignement().dawn();
		new AbstractInterfaceAssignement().day();
		new AbstractInterfaceAssignement().evening();
		new AbstractInterfaceAssignement().login();
		new AbstractInterfaceAssignement().logout();
		new AbstractInterfaceAssignement().morning();
		new AbstractInterfaceAssignement().night();
		//new AbstractInterfaceAssignement().
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("LOGIN");
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("LOGOUT");
	}

	@Override
	void morning() {
		// TODO Auto-generated method stub
		System.out.println("MORNING");
	}

	@Override
	void night() {
		// TODO Auto-generated method stub
		System.out.println("NIGHT");
	}

}
