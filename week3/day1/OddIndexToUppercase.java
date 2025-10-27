package week3.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		//converting string to chararray
		char[] testChar=test.toCharArray();
		//calculating the length of characters in a word
		int length=testChar.length;
		//Iterating the char and changing the odd position to uppercase
		for(int i=0;i<=length-1;i++)
		{
			if(i%2!=0)
			{
				testChar[i]=Character.toUpperCase(testChar[i]);
			}
		}
		
		System.out.println(testChar);

	}

}
