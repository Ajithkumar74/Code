package String;

public class ImmutableString {
//In Java, String objects are immutable. Immutable simply means unmodifiable or unchangeable.
	//Once String object is created its data or state can't be changed but a new String object is created.
	
	public static void main(String[] args) {
		String s="Sachin";
		s.concat("Tendulkar");//concat() method appends the string at the end  
		System.out.println(s);//will print Sachin because strings are immutable objects  
	}

}
