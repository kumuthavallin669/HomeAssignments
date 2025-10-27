package week3.day2;

//creating a subclass

public class InheritanceEdge extends InheritanceBrowser
{
	public void takesnap()
	{
		System.out.println("captured sceenshot");
	}
	public void clearcookies()
	{
		System.out.println("cleared cookies");
	}
	public static void main(String args[]) {
		//creating object and calling the methods of superclass and subclass
		InheritanceEdge e=new InheritanceEdge();
		e.takesnap();
		e.clearcookies();
		e.openurl();
		e.closebrowser();
		e.navigateback();

	}
}
