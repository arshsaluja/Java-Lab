import java.util.*;  
class n{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet <String>();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");  
           Iterator i=set.iterator();  
           while(i.hasNext())  //Can also be done without using iterator using <System.out.println(set);>
           {  
           System.out.println(i.next());  
           }  
		   
		   if(set.contains("Three"))
				System.out.println("Element is present in the set");
			else
				System.out.println("Element is not present in the set");
		   
		   set.clear();//To delete Hash set
		    System.out.println("Elements after deletion");
			System.out.println(set);
		
			
			
			
		   
 }  
}
