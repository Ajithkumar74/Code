package Java8.Lambda_Expression;
//In Java, Lambda expressions basically express instances of functional interfaces (An interface with a single abstract method is called a functional interface).
// Lambda Expressions in Java are the same as lambda functions which are the short block of code that accepts input as parameters and returns a resultant value.
interface FuncInterface
        {
          void abstractFun(int x);
         default void normalFun()
         {
             System.out.println("Hello");
         }
        } 
public class Test {
    public static void main(String[] args) {
        FuncInterface fobj=(int x)-> System.out.println(2*x);
        fobj.abstractFun(5);
    }

}
