package week3.day2;

//Create a Java class named APIClient and create two methods with the same name passing different input arguments.

public class APIClient {
	//One version should accept one input argument: a String for the endpoint
	public void sendRequest(String endpoint)
	{
		System.out.println(endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus)
	{
		System.out.println(endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}
	
	//Create a main method to demonstrate the usage of the overloaded sendRequest method.
	public static void main(String[] args) {
		//Inside the main method, create an object of the APIClient class.
		APIClient obj=new APIClient();
		//Call both versions of the sendRequest method on the APIClient object with different sets of input arguments to showcase method overloading.
		String endpoint ="API";
		String requestBody ="html";
		boolean requestStatus =true;
		obj.sendRequest(endpoint);
		obj.sendRequest(endpoint,requestBody,requestStatus);
		

	}

}
