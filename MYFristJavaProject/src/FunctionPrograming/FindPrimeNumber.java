package FunctionPrograming;

import java.util.stream.IntStream;

public class FindPrimeNumber {
	  // Returns true if the given integer is prime.
    // Assumes n >= 0.
    public static boolean isPrime(int n)
    {
        return IntStream.range(1, n + 1)
            .filter(x -> n % x == 0)
            .count() == 2;
}
}