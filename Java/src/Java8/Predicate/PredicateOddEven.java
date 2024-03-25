package Java8.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateOddEven {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Predicate <Integer> isOdd=n->n%2==0;
		Predicate <Integer> isEven=n->n%2!=0;
		
		List <Integer>EvenNumbers=l1.stream().filter(isEven).collect(Collectors.toList());
		List<Integer> OddNumbers=l1.stream().filter(isOdd).collect(Collectors.toList());
		
		System.out.println("Original Numbers"+l1);
		System.out.println("Even Numbers"+EvenNumbers);
		System.out.println("OddNumbers"+OddNumbers);
	}

}
