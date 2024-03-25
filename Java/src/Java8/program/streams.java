package Java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class streams {
	//java8 features using odd or even  program by using streams ,define predicates 
  public static void main(String[] args) {
	
	  //sample list of numbers
	  List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	  
      // Define predicates for odd and even numbers
	  Predicate<Integer> isOdd=n-> n%2!=0;
	  Predicate<Integer> isEven=n-> n%2==0;

      // Filter odd numbers using the stream and collect the result
	  List<Integer> oddNumbers=numbers.stream().filter(isOdd).collect(Collectors.toList());
	  
      // Filter even numbers using the stream and collect the result
	  List<Integer> evenNumbers=numbers.stream().filter(isEven).collect(Collectors.toList());
	  
	  //// Print the results
      System.out.println("Original numbers: " + numbers);
      System.out.println("Odd numbers: " + oddNumbers);
      System.out.println("Even numbers: " + evenNumbers);
}
}
