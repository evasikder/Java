package packageOne;

public class ClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java Assignment One

		// Step 1: Print "Hello World".
		System.out.println("Hello World");

		// Step 2: Create variables of each of the datatypes.
		String Name = "Eva";
		System.out.println(Name);

		int myClass = 25;
		System.out.println(myClass);

		boolean IAmaFemale = true;
		boolean IAmNotaFemale = false;

		System.out.println(IAmaFemale);
		System.out.println(IAmNotaFemale);

		char myGender = 'F';
		System.out.println(myGender);

		float myFloatNum = 3.14f;
		System.out.println(myFloatNum);

		// Step 3: Create an else if statement with the following conditions

		// condition1: if the number is negative then print "Number is negative"
		// condition2: if the number is less than 5 then print "Number is less than 5"
		// condition3: if the number is between 5 and 10 then print "Number is between 5
		// and 10"
		// condition4: if none of these match then print "Number is greater than 10"

		int myNumber = 7;
		if (myNumber < 0) {
			System.out.println("Number is negative");
		} else if (myNumber < 5) {
			System.out.println("Number is less than 5");
		} else if (myNumber > 5 && myNumber <10) {
			System.out.println(myNumber + " is between 5 and 10." );
		} else {
			System.out.println("Number is greater than 10");
		}

		// step 4: Create a loop that prints the value between and including 0 and 10.
		for (int i = 0; i <= 10; i = i + 1) {
			System.out.println(i);
		}

		// step 5:Create Switch statement with the following cases
		/*
		  cases "Lion" prints, "The animal is a Lion." 
		  cases "Tiger" prints, "The animal is a Tiger." 
		  cases "Zebra" prints, "The animal is a Zebra"
		  default prints, "Your animal is not listed"
		 */
		String animal = "bird";

		switch (animal) {
		case "Lion":
			System.out.println("The animal is a Lion.");
			break;
		case "Tiger":
			System.out.println("The animal is a Tiger");
			break;
		case "Zebra":
			System.out.println("The animla is a Zebra");
			break;
		default:
			System.out.println("Your animal is not listed");
		}
		
		//Step 6: Create an array of the following values "Netflix", "Hulu", "Amazon Prime", "Disney Plus".
		 
		String[] MyService = {"Netflix", "Hulu", "Amazon Prime", "Disney Plus"}; 
		 
		 /*
		  Print the value of 2 and 3 using the two- dimensional array.
		 */
		
		//Change the 3rd element  in the index to "HBO Max".
		String[] Myservice = {"Netflix", "Hulu", "Amazon Prime", "Disney Plus"}; 
		Myservice[3] = "HBO Max";
		System.out.println(Myservice[3]);
		//Outputs HBO Max
		
		//If the 2nd element in the array is "Amazon Prime" then print "True"
		 if (Myservice [2] == "Amazon Prime") {
			 System.out.println("statement is True");
		 } 
		 
		 //Loop through all array elements to print each element. 
		 String[] service = {"Netflix", "Hulu", "Amazon Prime", "Disney Plus"}; 
		 for (String i : service) {
			 System.out.println(i);
		 }
		 
		 // Create a two-dimensional array with the values {5,2,6,7},{3,6,7,1}
		 
		 int[][] myNewDoubleArray = { {5,2,6,7}, {3,6,7,1} };
		
		 //Print the value of 2 and 3 using the two- dimensional array.
		 
		  int x = myNewDoubleArray [0][1]; 
			System.out.println("my New Double Array is " +  x);
			int y = myNewDoubleArray [1][0];
			System.out.println("my New Double Array is " +  y);
			
			
			// step 7
			System.out.println(myMethod (2,3));
			
			// step 8
			System.out.println(calculations(5,7));
			
	}
		 
		//Step 7: Create a function that takes two integer parameters and returns the product.
	
	    public static int myMethod (int a, int b) {
	    	  return a + b;
	}
	

		//Step 8: Call you function and return the product of 5 and 7 as a variable.
	         
			 static int calculations (int x, int y) {
				    
				   return(x+y);
				   
					
				  } 
			 
} 
		
	
