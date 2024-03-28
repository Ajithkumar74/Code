package String;

import java.util.Scanner;

public class stringreverse {
	public static void main(String[] args) {
		//String s="Ajith",
		String s1="";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=input.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			s1=ch+s1;
		}
		System.out.println(s1);
	}

}
