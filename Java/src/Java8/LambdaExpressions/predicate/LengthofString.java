package Java8.LambdaExpressions.predicate;

import java.util.function.Predicate;

public class LengthofString {

	public static void main(String[] args) {
		Predicate<String>p=s->(s.length()>5);
		
		System.out.println(p.test("xyz"));
		System.out.println(p.test("bharath"));
	}

}
