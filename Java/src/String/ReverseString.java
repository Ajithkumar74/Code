package String;

public class ReverseString {
	public static void main(String[] args) {
		
	 String s="HelloWorld",s1="";
	 for (int i = 0; i <s.length() ; i++) {
		char ch=s.charAt(i);
		s1=ch+s1;
	}
	 System.out.println(""+s1);
	}
}
