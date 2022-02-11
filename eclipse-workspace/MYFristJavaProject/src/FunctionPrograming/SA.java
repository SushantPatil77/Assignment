package FunctionPrograming;

import java.util.Arrays;
import java.util.List;

public class SA {
  public static void main(String[] args) {
	  List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
      Integer sum = integers.stream()
        .reduce(0, (a, b) -> a + b);
      System.out.println(sum);
      
      
      List<Integer> integers1 = Arrays.asList(1, 2, 3, 4, 5);
      Integer summation = integers.stream()
        .reduce(0, Integer::sum);
      System.out.println(summation);
}
}
