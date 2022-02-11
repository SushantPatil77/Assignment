package String;

import java.util.Scanner;

public class MethodOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=sc.next();
		String s2="gomu";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(5));
		System.out.println(s1.concat(s2));
		
		

	}

}
