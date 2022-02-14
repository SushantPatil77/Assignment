package Abstraction;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Arrayslist {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(12);
		list.add(10);
		list.add(9);
		System.out.println(list);
		
		Set<Integer>list1=new TreeSet<Integer>(); 
		System.out.println(list1);
	}

}
