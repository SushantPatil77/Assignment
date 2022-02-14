package String;

import java.util.Scanner;

public class CreatingString {
	   public static void main(String [ ] args)
       {
		   ////java program to find length of the given string
           String s = new String();
           Scanner scn=new Scanner(System.in);
           System.out.println("Enter a string");
           s = scn.nextLine();   
           System.out.println("  "+s);
           System.out.println("length:"+s.length());
       }
}
