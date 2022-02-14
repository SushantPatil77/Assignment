package Collection;

import java.util.ArrayList;
import java.util.Iterator;


public class list2 {
	
	
	public static void main(String[] args)
	{
		ArrayList<String>list=new ArrayList<String>();
		list.add("Sushant");
		list.add("amol");
		list.add("rohit");
		list.add("ak");
		Iterator<String> s=list.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
	}

}
