package Array;


public class ExampleArray1 {
public static void main(String[] args) {
    //initializing array without passing values  
	int arr[]=new int[5];
	//delaration of an array
	int [] n;
	//initializing array after declaration
	n=new int[] {12,22,33,44,55,66};
	
	int num[]= {22,45,78,90,56,78};  //declaration of an array  and instantiation and initialization  
	
    //print each element of the array  
	/*
	 * for (int i = 0; i < num.length; i++) { System.out.println(n[i]); }
	 */
	for(int i:n) {
		System.out.println(i);
	}
}
}
