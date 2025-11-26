package week4.day1;
//Create a Concrete Class JavaConnection that inherits MySqlConnection, implementing methods.

public class JavaConnection extends MySqlConnection  {

	@Override
	public void connect() {
		System.out.println("Connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Updated");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("Query Executed");
		
	}
public static void main(String args[])
{
	JavaConnection j=new JavaConnection();
	j.connect();
	j.disconnect();
	j.executeUpdate();
	j.executeQuery();
}
}
