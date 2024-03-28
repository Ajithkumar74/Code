package String;

import java.util.Scanner;

public class ReverseString1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine(),s1="";
	 for (int i = 0; i <s.length() ; i++) {
		char ch=s.charAt(i);
		s1=ch+s1;
	}
	 System.out.println(" "+s1);
	}
}
