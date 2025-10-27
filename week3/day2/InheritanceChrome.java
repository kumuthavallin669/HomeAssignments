package week3.day2;

//creating a subclass

public class InheritanceChrome extends InheritanceBrowser {


			public void openincognito()
			{
				System.out.println("incognito lunched");
			}
			public void clearcache()
			{
				System.out.println("cache is cleared");
			}
		
public static void main(String args[]) {
	//creating object and calling the methods of superclass and subclass
	InheritanceChrome c=new InheritanceChrome();
	c.openincognito();
	c.clearcache();
	c.openurl();
	c.closebrowser();
	c.navigateback();
}
	
}
