package Java8;

import java.util.List;

public class FP02Functional {
	public static void main(String[] args) {
		List<Integer> l1=List.of(12,9,13,4,6,2,4,12,15);
		int sum=addListFunctional(l1);
		System.out.println(sum);
	}
	private static int sum(int a,int b) {
		return a+b;
	}
private static int addListFunctional(List<Integer> l1) {
	//Stream of numbers ->One result Value
	//Combine them into one result =>One Value
	// 0 and FP02Functional::sum
	
	return l1.stream().reduce(0,FP02Functional::sum);
	//combine them into one result => One value
	
}
}
