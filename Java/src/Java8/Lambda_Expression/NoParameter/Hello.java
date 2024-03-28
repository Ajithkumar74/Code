package Java8.Lambda_Expression.NoParameter;
// Java code to illustrate lambda expression
// without parameters
// functional interface
// without parameters
interface Test1{
    void print();
}
public class Hello {
    static void fun(Test1 t) { t.print(); }

    public static void main(String[] args) {
        fun(()->System.out.println("Hello"));
    }
}
