package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class itorater {
	 public static void main(String[] args) {
	        List<String> lst=new ArrayList();
	        lst.add("One");
	        lst.add("Two");
	        lst.add("Three");
	        lst.add("Four");
	        Iterator<String> iterator = lst.iterator();
	        System.out.println("Iterating using Iterator");
	        while(iterator.hasNext()){
	            System.out.println(iterator.next());
	        }
	        System.out.println("Enhanced For Loop");
	        for(Object obj:lst){
	            System.out.println(obj);
	        }
	        System.out.println("Regular For Loop");
	        for(int i=0;i<lst.size();i++){
	            System.out.println(lst.get(i));
	        }
	        System.out.println("converting to the string");
	        System.out.println(lst);
	        lst.remove(2);
	        lst.remove("Four");
	        System.out.println("After Deleting Index 2 and Object Four ");
	        System.out.println(lst);
	    }
}
