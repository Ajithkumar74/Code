package Java8.LambdaExpressions.functions;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<String,Integer>f=s->s.length();
	System.out.println(f.apply("Ajith"));
	System.out.println(f.apply("John"));

	}

}
