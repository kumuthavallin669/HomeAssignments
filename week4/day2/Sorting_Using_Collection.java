package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_Using_Collection {

	public static void main(String[] args) {
		//Declaring string array
		String[] values = {"Hcl", "Wipro", "Aspire systems", "CTS"};
		//creating a list
		List<String> list = new ArrayList<>();
		for(int i=0;i<values.length;i++)
		{
			list.add(values[i]);
		}

		System.out.println(list);
		//sorting the list
		Collections.sort(list);
		System.out.println(list);
		//printing the list in reverse order
		List<String> reversedList = new ArrayList<>();
		for(int j=list.size()-1;j>=0;j--)
		{
			reversedList.add(list.get(j));

		}
		System.out.println(reversedList);

	}

}
