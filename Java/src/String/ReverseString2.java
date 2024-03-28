package String;

import java.util.Iterator;

public class ReverseString2 {
public static void main(String[] args) {
	String a="Ajith";
	String result="";
	for (int i = a.length()-1; i >= 0; i--) {
		result+=a.charAt(i);
	}
	System.out.println(result);

}
}
