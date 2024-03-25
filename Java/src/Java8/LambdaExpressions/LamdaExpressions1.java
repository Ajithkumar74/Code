package Java8.LambdaExpressions;

import java.util.List;

public class LamdaExpressions1 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 3, 4, 6, 7, 8, 9, 56, 90);
		printnumbers(numbers);
	}

	private static void printnumbers(List<Integer> numbers) {
//	for (int number : numbers) {
//		System.out.println(number);
//	}
		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
	}
}
