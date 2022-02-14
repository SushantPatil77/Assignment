package Oprator;

public class BoolNotDemo {
	
	//write a java program to perform the logical operators
	   public static void main(String[ ] args)
       {
           int x = 2;
           int y = 1;
           boolean bl;
                   bl = !(x > y); // bl is false
           System.out.println("x is not greater than y:"+bl);
              bl = !(y > x); // bl is true
            System.out.println("y is not greater than x:"+bl);
       }

}
