package Lesson2;

import java.util.*;

public class MapEx {


	public static void main(String[] args) {
		
		//**************Hashmap*****************
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Nive");    
	      hm.put(2,"Kamal");    
	      hm.put(3,"Rakesh");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      
	      System.out.println(hm);
	  	
	      System.out.println();
	  		
	  	System.out.println("Get element at key 3: "+hm.get(3));
	  	
	  	System.out.println("Get element at key 2: "+hm.get(2));
	  	
	  	System.out.println("Get element at key 4: "+hm.get(4));
	  	
	  	System.out.println("Get element at key null: "+hm.get(null));
	  	
	  	hm.remove(3);
	  	
	  	
	      for(Map.Entry m:hm.entrySet())
	      {    
	    	  
	       System.out.println(m.getKey()+" "+m.getValue());    
	       
	      }
	      
	      
	     //**************HashTable*********************
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Poo");  
	      ht.put(5,"Yash");  
	      ht.put(6,"hema");  
	      ht.put(7,"Bala");  
	      
	        System.out.println("\nThe elements of HashTable are ");  
	      
	        System.out.println(ht);
	      
			System.out.println("Get element at key 2: "+ht.get(4));
			
			System.out.println("Get element at key 5: "+ht.get(5));
			
			System.out.println("Get element at key 8: "+ht.get(7));
			
			System.out.println("Get element at key 6: "+ht.get(6));
			
			//remove element by key
			
			ht.remove(5);
			
			System.out.println(ht);

	     
	      for(Map.Entry n:ht.entrySet())
	      {    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //************TreeMap****************************
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"George");    
	      map.put(9,"Raaj");    
	      map.put(10,"Sha");  
	      map.put(11, "Raaj");
	      map.put(19, null); //key is not null but value is null
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      
	     
			System.out.println(map);
			System.out.println("Get element at key 8: "+map.get(8));
			
			System.out.println("Get element at key 9: "+map.get(9));
			
			System.out.println("Get element at key 10: "+map.get(10));
			
			System.out.println("Get element at key 19: "+map.get(19));//as element is not present it will give you null answer
			
			//remove element by key
			
			map.remove(11);
			
			System.out.println(map);
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}




