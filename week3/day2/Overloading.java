package week3.day2;

public class Overloading {
	//creating method signature with 2 parameters
		public void reportstep(String msg, String status)
		
		{
			System.out.println(msg);
			System.out.println(status);
		}
		//creating method signature with 3 parameters
public void reportstep(String msg, String status, boolean snap)
		
		{
			System.out.println("Message");
			System.out.println("status");
			System.out.println("Take snapshot");
		}
public static void main(String args[])
{
	//creating object and passing the values to method arguments
	Overloading obj=new Overloading();
	String msg="Logged in";
	String status ="Pass";
	obj.reportstep(msg,status);
	obj.reportstep(msg, status, false);
	
}
	}


