/*here in this program I'm trying to show how we can implement different packages in the same class
 * by creating an object and calling the object in another package

*/
package package1;  //here i am taking package name is package1
import java.io.IOException;
import java.util.*;

public class Book {    // i am creating class name as Book
	
	 private String name ="wings of fire" ;    // here i am taking two variables
	 
	 private int costprice= 350 ;
	 
	 public void accept ()throws IOException{ // here creating main method which throws an exception
		       //
		 System.out.println("the book name is : "+name );  // here i'm printing  the book name
		 
		
		 System.out.println("costprice of the book is : "+costprice );   //here i am trying print the cost price
		 
	 }
	 }
	 
	


