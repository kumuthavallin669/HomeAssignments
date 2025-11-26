package week4.day2;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		//creating a string named google
		String companyName = "google";
		char[] characters = companyName.toCharArray();
		//creating a set to store the unique characters
		Set<Character> uniqueCharacter = new HashSet<>();
		//Iterate through each character in the companyName string.
		for(int i=0;i<companyName.length();i++)
		{
			uniqueCharacter.add(characters[i]);
		}
		System.out.println(uniqueCharacter);


	}

}
