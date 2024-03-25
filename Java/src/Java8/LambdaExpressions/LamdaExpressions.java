package Java8.LambdaExpressions;

public class LamdaExpressions {

public static void main(String[] args) {
	FunInterface Fobj=(int x)->System.out.println(2*x);
	Fobj.abstractFun(5);
}
interface FunInterface{
	void abstractFun(int x);
	
	default void normalFun()
	{
		System.out.println("Hello");
	}
}
}
