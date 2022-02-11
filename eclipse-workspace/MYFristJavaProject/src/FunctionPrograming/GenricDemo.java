package FunctionPrograming;

import java.util.ArrayList;
import java.util.List;

public class GenricDemo {
	   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        List<String> li = new ArrayList<String>();
	        li.add("Hi");
	            System.out.println( li.get(0).charAt(0) );
	            // previous line has syntax error
	            // return type of get is Object
	            // Object does not have a charAt method
	            // compiler relies on declared type
	            System.out.println( 
	                    ((String) li.get(0)).charAt(0) );
	            // must cast to a String
	    }
}
