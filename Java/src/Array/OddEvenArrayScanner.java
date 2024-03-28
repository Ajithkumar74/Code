package Array;

import java.util.Scanner;

public class OddEvenArrayScanner {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] numbers = new int[size];

        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Separate odd and even numbers
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];
        int oddCount = 0;
        int evenCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenCount] = number;
                evenCount++;
            } else {
                oddNumbers[oddCount] = number;
                oddCount++;
            }
        }

        // Print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
    }
}
