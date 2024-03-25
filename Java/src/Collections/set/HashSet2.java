package Collections.set;

import java.util.*;

public class HashSet2 {
//In this example, we see that HashSet doesn't allow duplicate elements.


	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("One");
		set.add("Three");
		set.add("Four");
		set.add("FIve");

	Iterator <String>i=set.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}

}
