package ExpectionHandling;

public class DemoTRy {
	  public static void main(String args[ ])
      {    try
          {
          throw new ArithmeticException("Hello");
          }
          catch(ArithmeticException e)
          {    System.out.println(e.getMessage());
          }
      }
}
