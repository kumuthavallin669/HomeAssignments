package week3.day1;

public class ReverseOddWordsinaString {

	public static void main(String[] args) {
		String test = "I am a software tester";
		//storing the string in array with spaces
		String[] testarray = test.split(" ");
		//calculating array length
		int length = testarray.length;
		//iterating each array elements and if the index is odd reversing the words
		for(int i=0;i<length;i++)
		{
			if(i%2!=0)
			{
				char[] charArray = testarray[i].toCharArray();
				int length1=charArray.length;
				for(int j=length1-1;j>=0;j--)
				{
					System.out.print(charArray[j]);
				}
			
			}
			else
			{
				System.out.print(testarray[i]);
			}
			System.out.print(" ");	
		}
		
				
		
	}

}
