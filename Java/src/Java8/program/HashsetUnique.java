package Java8.program;

import java.util.*;
import java.util.function.Predicate;

public class HashsetUnique {

	public static void main(String[] args) {
		 Set<Integer> numbers = new HashSet<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(2);
	        numbers.add(4);
	        numbers.add(3);
	        // Define a predicate to check uniqueness
	        Predicate<Integer> isUnique = new Predicate<Integer>() {
	            Set<Integer> set = new HashSet<>();
	            @Override
	            public boolean test(Integer number) {
	                return set.add(number);
	            }
	        };

	        // Print unique values
	        numbers.stream()
	               .filter(isUnique)
	               .forEach(System.out::println);
	    }
	}


