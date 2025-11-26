package week4.day1;

import java.util.List;
import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		//Declare an array for {3, 2, 11, 4, 6, 7}
		List<Integer> array1 = new ArrayList<>();
		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		//Declare another array for {1, 2, 8, 4, 9, 7}
		List<Integer> array2 = new ArrayList<>();
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		for (Integer value1 : array1) {
			for (Integer value2 : array2) {
				if(value1.equals(value2))
				{
					System.out.println(value1);
				}
			}

		}


	}

}
