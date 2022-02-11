package Arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entern Size of Arrays= ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter a element in arrays");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(java.util.Arrays.toString(a));
	}

}
