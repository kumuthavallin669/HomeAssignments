package week4.day1;

import java.util.List;
import java.util.ArrayList;

public class FindMissingElement {

	public static void main(String[] args) {
		//Declare an array {1, 2, 3, 4, 10, 6, 8}.
		int i,j, temp;
		List<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(10);
		array.add(6);
		array.add(8);
		//sorting the elements in list
		for(i=0;i<array.size();i++)
		{
			for(j=i+1;j<array.size();j++)
			{
				if(array.get(i)>array.get(j))
				{
					temp = array.get(i);
					array.set(i, array.get(j));
					array.set(j, temp);
				}
			}
		}
		System.out.println(array);
		//finding the missing element
		for (i = 0; i < array.size(); i++) {
			int current = array.get(i);
			int next=array.get(i+1);
		   if(next-current>1)
		   {
			   System.out.println(current+1);
		   }
		}
	}
}
