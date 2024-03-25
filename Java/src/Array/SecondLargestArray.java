package Array;


public class SecondLargestArray {
	
	public static int getSecondlargest(int[] a,int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i+1; j < total; j++) {
				if(a[i]>a[j]) {
					 temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
				}
			}
		}
	       return a[total-2];  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondlargest(a,6));  
		System.out.println("Second Largest: "+getSecondlargest(b,7)); 
	}

}
