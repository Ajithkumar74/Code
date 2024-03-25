package Arrays;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
	int a[]=new int[10];
	int i=0;
	for ( i = 0; i < a.length; i++) {
		a[i]=i+1;
	}
	for(i=0;i<10;i++) {
		System.out.println(a[i]);
	}
	}

}
