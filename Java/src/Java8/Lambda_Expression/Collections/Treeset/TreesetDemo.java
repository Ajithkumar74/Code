package Java8.Lambda_Expression.Collections.Treeset;

import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        TreeSet <Integer> tr=new TreeSet<Integer>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        tr.add(850);
        tr.add(235);
        tr.add(567);
        tr.add(876);
        tr.add(234);
        System.out.println("Elements of the TreeSet after" +
                " sorting are: " + tr);
    }
}
