package Java8;

import java.util.List;
//print only Odd numbers from the list
public class FP01Exercises { 
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printOddNumbersInListFunctional(numbers);

	}

//number ->number%2==0
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()// convert into Stream
				.filter(number -> number % 2 != 0)// lambda Expression
				.forEach(System.out::println);// Method Reference
		// Filter -Only Allow Even numbers
		// .filter(FP01Functional::isEven)
	}
}
