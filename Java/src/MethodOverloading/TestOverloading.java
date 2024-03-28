package MethodOverloading;
/*If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

 There are two ways to overload the method in java

By changing number of arguments
By changing the data type
Method Overloading: changing no. of arguments
 * */
 public class TestOverloading {
      static int add(int a, int b) {
    	  return a+b;
      }
      static int add(int a, int b,int c) {
    	  return a+b+c;
      }
      class Adder1{
    	  public static void main(String[] args) {
			System.out.println(TestOverloading.add(11,11));		
			System.out.println(TestOverloading.add(11,11,11));

		}
      }
}
