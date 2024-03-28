package Java8;

import java.util.List;

public class FP02Structured {
	public static void main(String[] args) {
		List<Integer> l1=List.of(12,9,13,4,6,2,4,12,15);
		int sum=addListStructured(l1);
		System.out.println(sum);
	}
private static int addListStructured(List<Integer> l1) {
	
	int sum=0;
	for(int num:l1) {
		sum+=num;
	}
	return sum;
}
}
