package String;

import java.util.Scanner;

public class stringreverse2 {
	public static void main(String[] args) {
		//String s="Ajith",
		String s1="";
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=input.nextLine();
		for (int i = s.length()-1;i>=0; i--) {
			s1+=s.charAt(i);
		}
		System.out.println(s1);
	}

}
