package Oprator;

public class PrecedenceDemo {
	
	  //write a java program to evaluates an arithmetic expression
	//according to the precedence order.
    public static void main(String[ ] args)
    {
            int a = 6;
            int b = 5;
            int c = 10;
            float rs = 0;
            rs = a + (++b)* ((c / a)* b);
            System.out.println("The result is:" + rs);
      }

}
