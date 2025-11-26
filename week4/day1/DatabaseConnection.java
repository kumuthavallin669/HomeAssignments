package week4.day1;
//Create an interface DatabseConnection with the following abstract methods:
//- connect()
//- disconnect()
//- executeUpdate()
public interface DatabaseConnection {
	public void connect();
	public void disconnect();
	public void executeUpdate();
}
