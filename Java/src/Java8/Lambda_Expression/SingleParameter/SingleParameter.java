package Java8.Lambda_Expression.SingleParameter;

interface one{
    void print(int p);
}
public class SingleParameter {
    static void fun(one o,int p){
        o.print(p);
    }
    public static void main(String[] args) {
        fun(p-> System.out.println(p),10);
    }
}
