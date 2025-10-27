package week3.day2;

//created subclass
public class LoginPage extends BasePage{
	//overriding superclass method
	public void performCommonTasks()
	{
		System.out.println("Task not performed");
	}

	public static void main(String[] args) {
		LoginPage obj=new LoginPage();
		obj.performCommonTasks();

	}

}
