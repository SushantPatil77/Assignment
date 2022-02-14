package ExpectionHandling;

public class tdemo {
	  public static void main(String args[])
      {    try
    {    throwsdemo td = new throwsdemo();
    }
    catch(NullPointerException e)
    {    System.out.println("recaught");
    }
}
}
