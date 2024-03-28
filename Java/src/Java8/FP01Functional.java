package Java8;

import java.util.List;

public class FP01Functional {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		//printCubeOfOddNumbersInListFunctional(numbers);
		//printEvenNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);
	}

//		private static void print(int number) {
//			System.out.println(number);
//		}
//	private static Boolean isEven(int number) {
//		return number % 2 == 0;
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().forEach(System.out::println);// Method Reference
	}

//number ->number%2==0
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().sorted().filter(number -> number % 2 == 0)// lambda Expression
				.forEach(System.out::println);// Method Reference
		// Filter -Only Allow Even numbers//.filter(FP01Functional::isEven)
	}

	private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().filter(number -> number % 2 == 0)// lambda Expression
				// mapping -x -> x*x
				.map(number -> number * number).forEach(System.out::println);// Method Reference
		// Filter -Only Allow Even numbers//.filter(FP01Functional::isEven)
	}

	private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).map(number -> number * number * number)
				.forEach(System.out::println);
	}
}
