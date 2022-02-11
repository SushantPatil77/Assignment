package Arrays;

public class IntaillzationArray {

	public static void main(String[] args) {
		int a[]= new int[101];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=i;
		}
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
		}
		System.out.println("Sum = "+sum);

	}

}
