package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		//Initializing count value to 0
		int count=0;
		//storing the string in array with spaces
		String[] word = text.split(" ");
		int length = word.length;
		//iterating each word and replacing duplicate word with spaces
		for (int i = 0; i < word.length; i++) {
       for(int j=i+1;j<word.length;j++)
       {
    	   if(word[i].equalsIgnoreCase(word[j])&&!word[i].equals(" "))
    	   {
    		  word[j]=" ";
    		   count++;
    	   }
       }
       //if duplicate is found printing the duplicate word with space
       if(count>0)
       {
    	   for(i=0;i<word.length;i++)
    	   {
    		   System.out.print(word[i] + " ");
    	   }
       }

	}
	}
}
