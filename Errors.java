/**
 * Auto Generated Java Class.
 */
public class Errors {
  
  
  public static void main(String[] args) { 
    
    // Lesson 05.05. Error types and how to avoid them
    // DON'T try and compile or run this program! It's intentionally full of errors!
    //Compile-time errors: Show up when code is compiled - Syntax.
    
    System.out.println("Forgetting a semicolon is the most common.")
      
    x = 5
    
    System.out.println(x + "Remember to declare a variable's data type.");
    System.out.println(y + "Or initialize it.");
    
    int public = 8
    
    System.out.println(public + "Or using a keyword as a variable.");
    
    while(x > 5) {
      System.out.println("Proper placement of curly brackets is key."); }}
  
    // Runtime errors/exceptions: 
  
    // Dividing by zero:
  
    int a = 4;
    int b = 0;
      
    int c = a / b;
    
    // KNOW THESE TYPES FOR THE AP EXAM:
    
    /* ArithmeticException - breaking math rules, like dividing by zero
     * 
     * NullPointerException - referring to a place in memory that is either empty or null
     * Example: Creating a variable for a null string and trying to print its length
     * 
     * IndexOutofBoundsException
     * ArrayIndexOutOfBoundsException - Both of the above are for misusing array data.
     * Ex: For an array with 7 slots (numbered 0 through 6), attempting to access
     * data from indice (slot) 7, which does not exist. This is a "one-off" error.
     * 
     * IllegalArgumentException - Used an illegal argument in the parameters of a
     * method. We'll get into this more when we get to classes and objects.
     * */
    
    //Exception handling: Anticipating future errors. Catching if a value is zero before
    // dividing by it, putting up a warning box that show up when a string input is
    // given for what is supposed to be a string input, etc. Defensive programming.
    // Again, will elaborate more in classes and objects.
    
    // Logic errors: The tough ones. Hand trace your code and get practice as to 
    // figuring out where the error probably is.
    // A common error is putting a ";" in too early, abruptly ending a line of code.
    
    
  
      
      
    
    
    
    
  }  
}
