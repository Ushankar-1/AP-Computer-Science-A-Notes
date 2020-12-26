/**
 * Auto Generated Java Class.
 */

import java.util.Random;
import java.util.Scanner;

// Lessons 07.01 and 07.02: String Class and String Methods

// Strings are a prebuilt Java class! So treat them like one.
// note: this is why String is capitalized but int, double, boolean, etc. are not

public class Strings {
  
  public static void main(String[] args) { 
    
    // You can make empty strings to fill in at later dates in the program!
    // There's a constructor for making an empty string! Here it is:
    
    String thisIsEmpty = new String();
    
    // nothingToSeeHere is not null. It's empty. It can be used in methods.
    
    // You can also create a null string by making a string reference variable
    // not connected to an object. This makes it null. Do it like this:
    
    String thisIsNull;
    
    // Remember, you can't use a null string in a method! 
    // You'll get a NullPointerException!
    
    // Concatenate (attach) strings with + or +=
    
    String a = "\nI am ";
    String b = "tired.";
      
    String mood = a + b; 
    
    System.out.println(mood); 
    
    // Back on topic: A different, simpler method of concatenation!
    
    String c = "\n~But I would walk five hundred ";
    String d = "miles\n";
    
    System.out.println(c += d);
    
    // You don't even need to use just strings! Most things will work fine! Like int!
    // Just omit the =.
    
    String words = ". That's how many dollars I have.";
      
    Random rand = new Random();
    int randNumber = rand.nextInt(9999);
      
    System.out.println(randNumber + words);
    
    // Be careful when trying to do arithmetic on numbers WITHIN a print statement!
    
    int cash = 50000;
    int paycheck = 4000;
    String money = "\nI will soon have $";
    System.out.println(money + cash + paycheck + ".");
    System.out.println("Wait. That wasn't the number I expected.");
    
    // Try again:
    
    money = "\nWhat I meant was, I will soon have $";
    System.out.println(money + (cash + paycheck) + ".\n");
    
    // Because of order of operations, p much ANYTHING grouping the ints together works!
    
    String yodaMoney = " dollars is how much I will soon have.";
    System.out.println(cash + paycheck + yodaMoney);
    
    // This works because both int variables are together, so they're added properly!
    
    //--------------------------------------------------------------------------------
    // Lesson 07.02: String methods
    
    // The .equals() method! See below.
    
    Scanner scan = new Scanner(System.in);
    String correctAnsr = "More questions";
    String userAnsr;
    
    System.out.println("\nWhat is the prize for answering these quiz questions correctly?");
    userAnsr = scan.nextLine();
      
    boolean tF = userAnsr.equals(correctAnsr);

    if(tF == false) {
      System.out.println("\nWRONG! Capitalization and proper spacing count with the .equals() method, of course!\n");
      System.out.println("The correct answer was... "+correctAnsr+"!\n");
    }
    else {
      System.out.println("\nCORRECT, and with the exact capitalization, spelling, and spacing as per");
      System.out.println("the .equals() method! Here's your prize!\n");
    }
    
    // This is the compareTo method!
    // It compares strings lexicographically, meaning each separate character has a
    // different value in Unicode. lowercase letters have greater integer values than
    // UPPERCASE LETTERS!
    // if string1 > string2, it returns a positive integer. 
    // string1 < string2, it returns a negative, and if string1 == string2, it's 0.
    
    String yourName;
    String theirName;
    
    System.out.println("Enter your name.");
    yourName = scan.nextLine();
    
    System.out.println("Enter the name of your friend.");
    theirName = scan.nextLine();
    
    int whosBetter = yourName.compareTo(theirName);
    
    if(whosBetter > 0) {
      System.out.println("\nMathematically, you are greater than your friend.");
    }
    else if(whosBetter < 0) {
      System.out.println("\nMathematically, your friend is greater than you.");
    }
    else {
      System.out.println("\nHmmm. An odd case. It appears that the two of you are exactly equal in greatness.");
      System.out.println("Do with this information what you will.");
    }
    
    // indexOf() method returns the position of one or more characters in a string.
    // Keep in mind that the first letter of a word would be position 0!
    
    System.out.println("\nEnter a word. Any word of your choosing.");
    String yourWord = scan.nextLine();
    
    System.out.println("Enter any character or short string of characters you would like to find in this word.");
    String yourPhrase = scan.nextLine();
    
    int position = yourWord.indexOf(yourPhrase);
    
    if(position == -1) {
      System.out.println("There is no '"+yourPhrase+"' in '"+yourWord+"'.");
    }
    else {
    System.out.println("The string '"+yourPhrase+"' can first be found at letter "+(position+1)+" of your word.");
    }
    
    // The substring() method can extract character(s) from a string starting and
    // ending at a given position. 
    // This method is overloaded, meaning it has more than one version.
    // substring(int index) starts extracting at the given index position.
    // It stops at the end of the string.
    // substring(int index1, int index2) extracts from positioin index1 to index2.
    
    System.out.println("\nChoose what string you want to extract characters from:");
    String yourExtractee = scan.nextLine();
    
    System.out.println("\nChoose the position from which you want to begin extracting:");
    int index1 = scan.nextInt();
    index1 += 1;
    
    System.out.println("\nChoose the last position to extract from:");
    int index2 = scan.nextInt();
    index2 += 1;
    
    String extractResult = yourExtractee.substring(index1, index2);
    System.out.println(extractResult);
    
    
    
    
    
    
  }
}
    
    
    


