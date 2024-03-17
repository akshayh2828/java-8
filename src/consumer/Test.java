package consumer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class Test 
{
	public static void main(String[] args) {
		
		
		
		HashMap<String, Integer> map = new HashMap<>();
		 
        // Adding elements to the Map
        // using standard put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
 
        // Print size and content of the Map
        System.out.println("Size of map is:- "
                           + map.size());
 
        // Printing elements in object of Map
        System.out.println(map);
 
        List<Integer> ls=Arrays.asList(10,20,50,50,40);
        System.out.println(ls);
        
        // Checking if a key is present and if
        // present, print value by passing
        // random element
		/*
		 * if (map.containsKey("vishal")) {
		 * 
		 * // Mapping Integer a = map.get("vishal");
		 * 
		 * // Printing value for the corresponding key
		 * System.out.println("value for key" + " \"vishal\" is:- " + a); }
		 */
	}

}
 