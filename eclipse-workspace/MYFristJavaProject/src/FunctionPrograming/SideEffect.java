package FunctionPrograming;

public class SideEffect {
	 public static int x;
	 
	    public static int f(int n)
	    {
	        x = x * 2;
	        return x + n;
	    }
	 
	    // what if it were 2 * f(x)?
	    public static void main(String[] args) {
	        x = 5;
	        int result = f(x) + f(x);
	        System.out.println(result);
	    }
}
