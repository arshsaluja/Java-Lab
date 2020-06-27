import java.util.*;  
public class p97{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(4,"Grapes");   
       
   System.out.println("Iterating Hashmap...");  
    System.out.println("Initial Mappings are: " + map); // Displaying the Hash Map
	System.out.println("Is the key '5' present? " +  map.containsKey(5)); //Searching a key
	System.out.println("Is the value 'Banana' present? " +  map.containsValue("Banana"));//Searching a value
	System.out.println("All keys are:");
	Set keys=map.keySet();	//keySet method returns all the keys
	System.out.println(keys);
   /*for(Map.Entry m : map.entrySet()){    //
    System.out.println(m.getKey()+" "+m.getValue());  
   }	
	*/
     
}  
}
