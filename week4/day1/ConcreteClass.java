package week4.day1;

public class ConcreteClass implements DatabaseConnection {

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
	public static void main (String args[])
	{
		ConcreteClass c= new ConcreteClass();
		c.connect();
		c.disconnect();
		c.executeUpdate();

	}
}
