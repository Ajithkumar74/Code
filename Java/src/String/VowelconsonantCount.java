package String;

import java.util.Iterator;
import java.util.Scanner;

public class VowelconsonantCount {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input=scanner.nextLine().toLowerCase();
		
		int vowelCount=0;
		int consonantCount=0;
		for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(Character.isLetter(ch)) {
            	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch =='u') {
            		vowelCount++;
            	}else {
            		consonantCount++;
            	}
            }
		}
		System.out.println("Total number of vowels: "+ vowelCount);
		System.out.println("Total number of consonants: "+  consonantCount);
	}

}
