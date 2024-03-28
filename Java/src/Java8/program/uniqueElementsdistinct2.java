package Java8.program;


import java.util.*;
import java.util.stream.Collectors;
//HashSet
public class uniqueElementsdistinct2 {
	public static void main(String[] args)
    {
 
        // Create ArrayList of Integer
        ArrayList<Integer> Numbers
            = new ArrayList<Integer>();
 
        // add elements to ArrayList
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(22);
        Numbers.add(45);
        Numbers.add(4);
        Numbers.add(2);
 
        /*Converting List to HashSet using constructor.
         */
 
        Set<Integer> hashSetNumbers
            = new HashSet<Integer>(Numbers);
 
        System.out.println("Unique Values of ArrayList");
 
        // iterate through HashSet
        for (Integer strNumber : hashSetNumbers)
            System.out.println(strNumber);
    }
}