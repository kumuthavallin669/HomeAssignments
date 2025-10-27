package week3.day1;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		//array 1 elements
		int a[]={3,2,11,4,6,7}; 
		//array 2 elements
		 int b[]={1,2,8,4,9,7};
		 //sorting the array elements
		 Arrays.sort(a);
		 Arrays.sort(b);
		 //calculating array length
		 int length =a.length;
		 //iterating the 2 array elements and finding the intersection
		 for(int i=0;i<length-1;i++)
		 {
			 for(int j=0;j<length-1;j++)
			 {
				 if(a[i]==b[j])
				 {
					 System.out.println(a[i]);
				 }
			 }
		 }

	}

}
