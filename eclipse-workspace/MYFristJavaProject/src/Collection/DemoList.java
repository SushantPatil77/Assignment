package Collection;

import java.util.LinkedList;
import java.util.List;

public class DemoList {
	public static void main(String [ ] args)
	{
		List<String> nameList = new LinkedList<String> (); 
	     String [ ] names = {"Ann", "Bob", "Carol"}; 
	// Add to arrayList for 
	for (int k = 0; k < names.length; k++) 
	{
		nameList.add(names[k]);
	}
	// Display name list
	for (int k = 0; k < nameList.size(); k++) 
		{
		  System.out.println(nameList.get(k)); 
		}
	}
}