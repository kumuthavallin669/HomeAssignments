package week3.day1;

public class Reversestring {

	public static void main(String[] args) {
		String companyName = "TestLeaf";
		//converting string to characters
		char[] name = companyName.toCharArray();
		//iterating the elements from last to first and printing it
		for(int i=name.length-1;i>0;i--)
		{
			System.out.println(name[i]);
		}
		
		

	}

}
