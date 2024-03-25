package Java8;

import java.util.List;
//Print All Courses individually
public class FP01Exercises3 {
	public static void main(String[] args) {
//		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//		printOddNumbersInListFunctional(numbers);

		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		  
		courses.stream().filter(course ->course.contains("Spring")).forEach(System.out::println);

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
