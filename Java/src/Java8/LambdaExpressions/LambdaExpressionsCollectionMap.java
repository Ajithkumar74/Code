package Java8.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class LambdaExpressionsCollectionMap {

	public static void main(String[] args) {
		
		TreeSet<Integer >al=new TreeSet<Integer>((o1,o2)->(o1>o2)? -1:(o1<o2)?1:0);

		al.add(12);
		al.add(450);
		al.add(67);
		al.add(89);
		al.add(67);
		al.add(42);

		System.out.println("Elements of the ArrayList after" + 
                " sorting : " + al);
	}
	
}
