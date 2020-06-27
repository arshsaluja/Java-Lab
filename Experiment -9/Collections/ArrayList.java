import java.util.*;  
public class p95
{  
	 public static void main(String args[])
	{  
	  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	  list.add("A");//Adding object in arraylist    
	  list.add("B");    
	  list.add("C");    
	  list.add("D");    
	  Iterator itr=list.iterator();  
		 while(itr.hasNext())  
		{  
			System.out.println(itr.next());  
		}  
	
	ArrayList list2= (ArrayList) list.clone();
	 System.out.println("Elements of list2");
	 Iterator itr2=list2.iterator();  
	 while(itr2.hasNext())  
	{  
		System.out.println(itr2.next());  
	}  
	Collections.reverse(list);
	
	Iterator itr3=list.iterator(); 
System.out.println("Elements in reverse order")	;
	 while(itr3.hasNext())  
	{  
		System.out.println(itr3.next());  
	}  
	
  
 }  
}
