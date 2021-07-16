
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class Assignment7 {
		    //HashSet

		    public static void main(String[] args) {
		    	
		    	
		        // * Step 1 Create a HashSet of String objects called myHashSet
		    	
		    	HashSet<String> myHashSet = new HashSet<String>();
		    	
		        /*
		        * Step 2 add the following String objects to myHashSet "New York" "Florida" "Maine"
		        * "Lousiana" "Colorado"
		        */
 
		    	HashSet<String> myHashSet1 = new HashSet<String>();
		    	
		    	myHashSet1.add("New York");
		        myHashSet1.add("Florida");
		    	myHashSet1.add("Maine");
		    	myHashSet1.add("Lousiana");
		    	myHashSet1.add("Colorado");
		    	
		        System.out.println(myHashSet1);
		    	
		        /*
		         * Step 3 Display to console all the values of myHashSet ... hint use iterator
		        */
		        
                HashSet<String> myHashSet11 = new HashSet<String>();
		    	
		    	myHashSet11.add("New York");
		        myHashSet11.add("Florida");
		    	myHashSet11.add("Maine");
		    	myHashSet11.add("Lousiana");
		    	myHashSet11.add("Colorado");
		    	
		    	Iterator<String> it = myHashSet11.iterator();
		    	while(it.hasNext()) {
		    		  System.out.println(it.next());
		    	}


		        // Step 4 Remove from myHashSet where String = 'Florida"

		        HashSet<String> myHashSet111 = new HashSet<String>();
		    	
		    	myHashSet111.add("New York");
		        myHashSet111.add("Florida");
		    	myHashSet111.add("Maine");
		    	myHashSet111.add("Lousiana");
		    	myHashSet111.add("Colorado");
		    	
		    	myHashSet111.remove("Florida");
		    	System.out.println(myHashSet111);
		    	
		        // Step 5 Display to console the number of elements in myHashSet

                HashSet<String> myHashSet2 = new HashSet<String>();
		    	
		    	myHashSet2.add("New York");
		        myHashSet2.add("Florida");
		    	myHashSet2.add("Maine");
		    	myHashSet2.add("Lousiana");
		    	myHashSet2.add("Colorado");

		}

}
