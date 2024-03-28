package Array;

public class SortDescendingArray {

	public static void main(String[] args) {
		int[] arr=new int[] {2,5,6,8,9,23,67,8,9,34};
		int temp=0;
		System.out.println("Original Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j] ) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements of Array sorted in Decending Array Order:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
