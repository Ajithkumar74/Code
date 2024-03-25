package Java8.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressions2 {

	public static void main(String[] args) {
		List<Integer> list = List.of(12, 7, 8, 9, 3, 5, 12, 1, 5, 1, 7, 8, 19, 12, 1, 9);
		//printsquareofoddNumbers(list);
		int sum= printsquareofoddNumbers(list);
		System.out.println(sum);
		
	}
	
	private static int addlist(int a,int b) {
		System.out.println(a+" "+b);
		return a+b;
	}
 
	private static int printsquareofoddNumbers(List<Integer> list) {
//		list.stream()
//		.map(n -> n * n)
//		.filter(n -> n % 2 != 0)
//		.forEach(n -> System.out.println(n));
		return list.stream().filter(n->n%2==0).reduce(0,Integer::sum);

	}
}
