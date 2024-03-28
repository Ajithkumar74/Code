package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//No Duplicate Key on HashMap

public class HashMap1 {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(1, "Manago");
	map.put(2, "Apple");
	map.put(2,"Banana");// only unique keys
	 map.put(4,"Grapes");   
	   System.out.println("Iterating Hashmap...");  
for(Map.Entry m:map.entrySet()){
	System.out.println(m.getKey()+" "+m.getValue());
}
	
}
}
