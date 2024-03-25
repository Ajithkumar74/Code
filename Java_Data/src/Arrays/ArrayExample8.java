package Arrays;

import java.util.Scanner;

public class ArrayExample8 {

		 public static void printElements(int list[])
		    {
		        for (int ele : list) {
					System.out.println(ele);
				}
		    }
		    public static void main(String[] args) {
		    	 ArrayExample9 obj=new ArrayExample9();
		         int []arr={1,2,3};
		         System.out.println("First Array");
		         obj.printElements(arr);
		         int []arr2={9,8,7,6,5,4,3};
		         System.out.println("Second Array");
		         obj.printElements(arr2);
		    }

	}

