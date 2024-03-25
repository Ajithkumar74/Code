package Array.MultiDimensional;
//addition 3 3 matrix
public class Array1 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 4, 4, 5 } };
		int[][] arr1 = { { 1,2,3 }, { 4, 5, 6 }, { 4, 4, 5 } };
		int[][] arr2 = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr2[i][j] = arr[i][j] + arr1[i][j];
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
