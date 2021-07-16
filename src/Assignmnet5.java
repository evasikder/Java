
import java.util.ArrayList;
import java.util.List;


public class Assignmnet5 {
//ArrayList 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>myArrayList = new ArrayList<String>();
		
		myArrayList.add("Chrome");
		myArrayList.add("Firefox");
		myArrayList.add("IE");
		myArrayList.add("Safari");
		myArrayList.add("Chrome");
		
		//Step 1 display the number of elements in myArrayList
		
		ArrayList<String> Websites = new ArrayList<String>();
		
		Websites.add("Chrome");
		Websites.add("Firefox");
		Websites.add("IE");
		Websites.add("Safari");
		Websites.add("Chrome");
		
		System.out.println(Websites);
		
		
		//Step 2 using enhanced for-loop loop thru myArrayList and display all values to console.
		 

		ArrayList<String> websites = new ArrayList<String>();
		
		websites.add("Chrome");
		websites.add("Firefox");
		websites.add("IE");
		websites.add("Safari");
		websites.add("Chrome");
		
		String [] websites1 = {"Chrome", "Firefox", "IE", "Safari", "Chrome"};
		for (int i = 0; i < websites1.length; i++) {
			System.out.println(websites1[i]);
		
		}
		
		//Step 3 Display the 3rd element in myArrayList
		
		String [] websites2 = {"Chrome", "Firefox", "IE", "Safari", "Chrome"};
		System.out.println (websites2[3]);
				

		/**
		 * Step 4 Loop thru myArrayList to determine if any elements value = 'IE' if 
		 * yes, display 'IE found @ index' and the index number in the console then exit
		 * the loop
		 */
		
        ArrayList<String> websites3 = new ArrayList<String>();
		
		websites3.add("Chrome");
		websites3.add("Firefox");
		websites3.add("IE");
		websites3.add("Safari");
		websites3.add("Chrome");
		
		for (String i : websites3) {
		      System.out.println(i);
		    }
		
		
		
		/**
		 * Step 5 Loop thru myArrayList to determine if any list elements value = 'Opera'
		 * if not, display 'Opera not found'
		 */
	}

}
