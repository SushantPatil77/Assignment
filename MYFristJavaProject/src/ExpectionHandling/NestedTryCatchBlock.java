package ExpectionHandling;

public class NestedTryCatchBlock {
	 public static void main(String args[ ])
     {    try
         {    int a=args.length;
             System.out.println("a="+a);
             int b=42/a;
             System.out.println(b);
         }
         catch(ArithmeticException e)
         {    System.out.println(e.getMessage());
         }
         try
         {    int c[ ]={1};
             c[40]=99;
         }
         catch(ArrayIndexOutOfBoundsException e)
         {    System.out.println(e.getMessage());
         }
     }
}
