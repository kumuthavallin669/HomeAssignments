package week3.day2;

public class LoginTestData extends TestData {
	//created enterUsername() method
	public void enterUsername()
	{
		System.out.println("Entered username");
	}
//created enterPassword() method
	public void enterPassword()
	{
		System.out.println("Entered password");
	}
	public static void main(String[] args) {
		
		//creating object for class
		LoginTestData obj=new LoginTestData();
		//calling the method of subclass and superclass using object
		obj.enterCredentials();
		obj.enterPassword();
		obj.enterUsername();
		obj.navigateToHomePage();
		
	}

}
