package ExpectionHandling;

import java.util.Scanner;

public class DemoExpection {
	 public static void main(String [ ]args)
     {    int a,b,c;
         System.out.println("Enter two integer values");
         Scanner scon = new Scanner(System.in);
         a = scon.nextInt();
         b = scon.nextInt();
         try   
         {    c=a/b;
             System.out.println ("Quotient="+c);
         }
         catch(Exception e)
         {    System.out.println(e);
         }
     }
}
