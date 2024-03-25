package Java8.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpressionsCollection {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(450);
		al.add(67);
		al.add(89);
		al.add(67);
		al.add(42);
		System.out.println("Elements of the ArrayList " + "before sorting :" + al);
        // using lambda expression in place of comparator object

		Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 : o1 < o2 ? 1 : 0);
		System.out.println("Elements of the ArrayList after" + 
                " sorting : " + al);
	}
	
}
