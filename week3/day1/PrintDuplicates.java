package week3.day1;

public class PrintDuplicates {

	public static void main(String[] args) {
		//Declaring array elements using array literals
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		//calculating array length
		int length = num.length;
		//iterating each elements and finding the duplicate number
		for(int i=0;i<=length-1;i++)
		{
			for(int j=i+1;j<=length-1;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println(num[j]);
				}
			}
		}

	}

}
