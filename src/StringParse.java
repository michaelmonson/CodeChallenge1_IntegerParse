import java.util.Scanner;


public class StringParse {
	
	// Create a single shared Scanner for keyboard input
    private static Scanner scanner = new Scanner( System.in );
    
    private static final int ASCII_NUMBER_MIN_BOUNDARY = 48;
    private static final int ASCII_NUMBER_MAX_BOUNDARY = 57;
    

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.print( "\n\t\t STG ~ Code Challenge #1\n\n" );        
		System.out.print( "This program parses an alphanumeric user input String for single integer values, \n" );
		System.out.print( "and returns the summation of each number found within the String. \n\n" );
		
		System.out.print( "Please enter a series of characters: " );
		
        // Read the of text entered by the user:
        String userInput = scanner.nextLine();
        char[] userInputArray = userInput.toCharArray();
        
        try {
        	
        	int summation = 0;
        	int numbersParsed = 0;
        
        	for (int i = 0; i < userInputArray.length; i++) {
        		
        		int charValue = userInputArray[i];
        		
        		if (userInputArray[i] >= ASCII_NUMBER_MIN_BOUNDARY 
        				&& userInputArray[i] <= ASCII_NUMBER_MAX_BOUNDARY) {
        			
        			summation = summation + (charValue - ASCII_NUMBER_MIN_BOUNDARY);
        			numbersParsed++;        			
        		}            	
            }
            
            // Display the input back to the user.
            System.out.println( "\n   You submitted:    " + userInput);
            System.out.println( "\n   Integers found:   " + numbersParsed);
            System.out.println( "\n   Summation result: " + summation);
            
        } catch (Exception e) {        	
        	e.printStackTrace();
        	
        }        
	    
	    System.exit(0);

	}

}
