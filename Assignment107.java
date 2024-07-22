//WAP using upcasting concept
package assignementBatch42;

class Mumbai
{
	void vehicle()
	{
		
	}
	void busses()
	
	{
		
	}
}
public class Assignment107 extends Mumbai{
	void add()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mumbai d1=new Assignment107();//Upcasting 
		d1.busses();//will only be able to access parent class properties.
		d1.vehicle();//can not be able to access child class properties.
		
	}

}
