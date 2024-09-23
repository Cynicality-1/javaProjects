/**
 * This class is a basic introduction to exception handling. Two methods, divide() and stringLength() are used in order to demonstrate
 * how exception handling works, by returning different values if a problem occurs.
 * @author Seiji Ting
*/
public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Initializing testing for divide() and stringLength()...\n");
		
		System.out.println("Normal: divide(10, 2) returns " + divide(10, 2));
		System.out.println("Exception (/0): divide(7, 0) returns " + divide(7, 0));
		System.out.println("Exception (/0): divide(-7, 0) returns " + divide(-7, 0) + "\n");
		
		System.out.println("Normal: stringLength(\"I love java coding\") returns " + stringLength("I love java coding"));
		System.out.println("Exception (null): stringLength(null) returns " + stringLength(null) + "\n");
		
		System.out.println("Testing complete.");
		
	}
	
    public static int divide(int x, int y) { //Basic method that divides two numbers. If y is 0, an exception is caught by this method
    	try {
    		return x / y; //Normal case for division
    	} 
    	catch(java.lang.ArithmeticException e) { //If y = 0...
    		if(x >= 0) {
    			return Integer.MAX_VALUE; //If numerator is greater than 0(or equal to in order to catch all cases), return the integer limit number
    		} else {
    			return Integer.MIN_VALUE; //If numerator is less than 0, return the negative integer limit number
    		}
    	}
    }
    
    public static int stringLength(String s) { //Basic method that returns the length of a string. If the input is null, an exception is caught by this method
    	try {
    		return s.length(); //Normal case for a valid string
    	}
    	catch(java.lang.NullPointerException e) { //If null is passed as an input parameter...
    		return 0; //Return a length of 0
    	}
    }

}
