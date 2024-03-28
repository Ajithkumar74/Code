package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountDistinctWords {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        // Split the input string into words using whitespace as a delimiter
		        String[] words = input.split("\\s+");

		        // Create a Set to store distinct words
		        Set<String> distinctWords = new HashSet<>();

		        // Iterate through the array of words and add them to the Set
		        for (String word : words) {
		            distinctWords.add(word);
		        }
		        // Get the count of distinct words
		        int distinctWordCount = distinctWords.size();

		        System.out.println("Total number of distinct words: " + distinctWordCount);
		    }

}
