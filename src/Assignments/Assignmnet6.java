package Assignments;

import java.util.HashMap;

public class Assignmnet6 {
	//HashMap
	

	public static void main(String[] args) {

		//declare a HashMap called myHashMap with an Integer Key and String value.
        
		HashMap<Integer, String> Artist = new HashMap<Integer, String>();

        /*
        * Step 1 Load the following into ' myHashMap'
        *
        * Key: = 1 Value: = "Ariana Grande"
        * Key: = 2 Value: = "Khalid"
        * Key: = 3 Value: = "Drake"
        */
		
		Artist.put(1, "Ariana Grande");
		Artist.put(2, "Khalid");
		Artist.put(3, "Drake");
		
		System.out.println(Artist);
		      

        // Step 2 Display to console the value associated with key 2
		
		HashMap<Integer, String> Artist1 = new HashMap<Integer, String>();
		
		Artist1.put(1, "Ariana Grande");
		Artist1.put(2, "Khalid");
		Artist1.put(3, "Drake");
		
		System.out.println(Artist1.get(2));
		
	
        // Step 3 Display the number of elements in myHashMap

			HashMap<Integer, String> Artist3 = new HashMap<Integer, String>();
			  
			 Artist3.put(1, "Ariana Grande");
			  Artist3.put(2, "Khalid");
			  Artist3.put(3, "Drake");
				 
			 for (Integer i : Artist3.keySet()) {
				  System.out.println(i);
	}
			  
        // Step 4 Remove the last element in myHashMap and display the number of elements in myHashMap
        
          HashMap<Integer, String> Artist2 = new HashMap<Integer, String>();
		
		 Artist2.put(1, "Ariana Grande");
		 Artist2.put(2, "Khalid");
		 Artist2.put(3, "Drake");
		
	     Artist2.remove(3,"Drake");
	     System.out.println(Artist2);
	     
	     for (Integer i : Artist2.keySet()) {
			  System.out.println(i);
}
		
       }
	}

