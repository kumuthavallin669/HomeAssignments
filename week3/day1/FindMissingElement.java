package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		//Declaring array elements by using literls
		int arr[]= {1, 4,3,2,8, 6, 7};
		//sorting the array
		Arrays.sort(arr);
		//calculating the array length
		int length = arr.length;
		//iterating the array elements to find the missing number
		for(int i=0;i<length-1;i++)
		{
			if(arr[i]+1!=arr[i+1])
			{
				System.out.println(arr[i]+1);
				break;
			}
		}

	}

}
