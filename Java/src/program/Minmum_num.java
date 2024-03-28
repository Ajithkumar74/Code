package program;

public class Minmum_num {
	//creating a method which receives an array as a parameter  
		static void min(int arr[]) {
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
				System.out.println(min);
			}
		}
		
	}
		public static void main(String[] args) {
			int a[]= {22,4,5,7};
			min(a);
		}
}
