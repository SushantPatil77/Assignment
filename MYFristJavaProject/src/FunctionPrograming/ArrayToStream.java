package FunctionPrograming;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayToStream {
	 
		   public static void main(String[] args) 
		   {
		        // TODO Auto-generated method stub
		        // compute sum of absolute values of even ints
		        int[] numbers = {3, -4, 8, 4, -2, 17,
		                         9, -10, 14, 6, -12};
		        int positiveNum=10;
		        int negativeNum=-15;
		        System.out.println(Math.abs(negativeNum));
		        System.out.println(Math.abs(positiveNum));
		        IntStream s= Arrays.stream(numbers);
		        //System.out.println("Integer Stream from Arrays "+s.count());
		        System.out.println("Integer Stream from Arrays "+s.sum());
		        int sum = Arrays.stream(numbers)
		            .map(n -> Math.abs(n))  // abs stands for absolute value only positive value
		            .filter(n -> n % 2 == 0)
		            .distinct()
		            .sum();
		    }
	    }

