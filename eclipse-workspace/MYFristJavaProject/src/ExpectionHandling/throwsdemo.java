package ExpectionHandling;

public class throwsdemo {
	public throwsdemo() throws NullPointerException
    {    System.out.println("caught");
        throw new NullPointerException("demo");
    }
}
