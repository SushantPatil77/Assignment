package Arrays;

import java.util.Arrays;

public class SortingOfArray {

	public static void main(String[] args) {
		int a[]= {8,7,5,6,3,1,2,5,6,2};
		int temp = 0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j =i+1; j < a.length; j++)
			{
				if(a[i]>a[j])
				{ 
					temp=a[i];
				    a[i]=a[j];
				    a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
