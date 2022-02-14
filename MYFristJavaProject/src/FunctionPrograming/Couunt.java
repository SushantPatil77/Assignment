package FunctionPrograming;

import java.util.stream.IntStream;

public class Couunt {
	// compute the sum of the squares of integers 1-5
   public static void main(String[] args) 
   {
		int sum = 0;
		for (int i = 1; i <= 5; i++)
		{
		    sum = sum + i * i;
		}
		System.out.println(sum);
		// compute the sum of the squares of integers 1-5
		int sum1 = IntStream.range(1, 6)
		    .map(n -> n * n)
		    .sum();
		System.out.println(sum1);
 }

}
