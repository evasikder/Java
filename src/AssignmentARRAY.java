
public class AssignmentARRAY {

private static final int a = 0;
private static final int b = 0;



public static void main(String[] args) {

	//step 1: Create an array of the following values "Netflix", "Hulu", "Amazon Prime", "Disney Plus".
	
	String[] service = {"Netflix", "Hulu", "Amazon Prime", "Disney Plus"};
	
	
	//Step 2: Change the 3rd element in the index to "HBO Max".
	
	String[] Service = {"Netflix", "Hulu", "Amazon Prime", "Disney Plus"}; 
	service[3] = "HBO Max";
	System.out.println(Service[3]);
	//Outputs HBO Max
	
	//Step 3: If the 2nd element in the array is "Amazon Prime" then print "True".
	
    if (service [2] == "Amazon Prime") {
		System.out.println("statement is True" );
	} else { 
		System.out.println("statement is False");
	}

	
	//Step 4: Loop through all array elements to print each element
	
    String[] SErvice = {"Netflix", "Hulu", "Amazon Prime", "Disney Plus"}; 
	for (int i = 0; i < SErvice.length; i++) {
	  System.out.println( SErvice[i]);
	}
	
	//Step 5: Create a two-dimensional array with the values {5,2,6,7},{3,6,7,1}
	
	int [][] myNewDoubleArray = { {5,2,6,7},{3,6,7,1} };
	
	//Step 6: Print the value of 2 and 3 using the two dimensional array?
	
    int x = myNewDoubleArray [0][1]; 
	System.out.println("my New Double Array is " +  x);
	int y = myNewDoubleArray [1][0];
	System.out.println("my New Double Array is " +  y);
	
	//Step 7:
	myFunc(4,8);
}
	


	// Step 7: Call your method myFunc() and print the product of 4 and 8
	           
	         static void myFunc(int a , int b) {
		       System.out.println(a+b);

	
	
	       }



   }

