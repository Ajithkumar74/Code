package Collections.set.TreeSet;

import java.util.*;
//Let's see an example of traversing elements in descending order.


public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay"); 
	         System.out.println("Traversing element through Iterator in descending order");  

		  //Traversing elements  
	         Iterator i=set.descendingIterator();  
		  while(i.hasNext()){  
		   System.out.println(i.next());  
		  }
	}

}
