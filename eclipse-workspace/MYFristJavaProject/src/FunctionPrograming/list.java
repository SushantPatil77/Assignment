package FunctionPrograming;

import java.util.ArrayList;

public class list {
	public static void main(String[] args) {
		// compute sum of absolute values of even ints
		ArrayList<Integer> list =
		        new ArrayList<Integer>();
		list.add(-42);
		list.add(-17);
		list.add(68);
		list.stream()
		    .map(Math::abs)
		    .forEach(System.out::println);
	}
}
