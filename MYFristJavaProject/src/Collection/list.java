package Collection;

import java.util.ArrayList;

public class list {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("four");
		for (int i = 0; i <list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		System.out.println(list);

	}

}
