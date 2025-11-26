package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		//- Declare an array {3, 2, 11, 4, 6, 7}.
		int largest = 0;
		int secondLargest = 0;
		List<Integer> array = new ArrayList<>();
		array.add(3);
		array.add(2);
		array.add(11);
		array.add(4);
		array.add(6);
		array.add(7);
		//- Pick the 2nd element from the last and print it.
		for (Integer i : array) {
			if(i>largest)
			{
				secondLargest = largest;
				largest = i;

			}
			else if(i>secondLargest && i!=largest)
			{
				secondLargest = i;
			}


		}
		System.out.println(secondLargest);
	}

}
