package Java8.Lambda_Expression.MultipleParameter;

interface fun3{

    void print(int p,int q);
}
public class MultipleParameter {
    static void fun(fun3 f,int p,int q){
        f.print(p,q);
    }
    public static void main(String[] args) {
    fun((p,q)->System.out.println(p +" "+ q),10,20);
    }
}
