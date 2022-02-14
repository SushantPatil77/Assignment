package FunctionPrograming;

import java.util.stream.IntStream;

public class FactroialNumber {
	 // Returns n!, or 1*2*3*...*(n-1)*n.
    // Assumes n is non-negative.
    public static int factorial(int n) {
        return IntStream.range(2, n + 1)
            .reduce(1, (a, b) -> a * b);
    }
   
}
