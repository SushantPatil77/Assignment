package Mathematical;

public class MathFunctions {
	public static void main(String args[ ])
    {   
		/*The Given Program Calculates the Following Mathematical operations:
		1. Square root
		2. Power of a number
		3. Sine Value
		4. Cosine Value
		5. Logarithm Value
		6. Absolute value ,Simple Java Program For Various Mathematical Operation */
		double x = 8;
        double y;
        System.out.println("Given Number "+x);
        y = Math.sqrt(x);
        System.out.println("Square Root : "+y);
        y = Math.pow(x,3);
        System.out.println("Power : "+y);
        y = Math.sin(x);
        System.out.println("Sine : "+y);
        y = Math.cos(x);
        System.out.println("Cosine : "+y);
        y = Math.log(x);
        System.out.println("Logrithm : "+y);
        y = Math.abs(x);
        System.out.println("Absolute Value : "+y);
    }
}
