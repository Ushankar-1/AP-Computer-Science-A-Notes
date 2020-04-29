/**
 * Auto Generated Java Class.
 */

// Lesson: Operators. Relational, Comparison, Logical/Conditional, and Precedence
// Relational:
// >, >=, <, <=. Return Boolean true or false
// Comparison:
// Equality operator is ==. Inequality is !=. Both are Boolean. 

// Logical operators: && (and), || (or), ! (not)
// Other things like parentheses, dots, keyword "nu" that I haven't learned yet, etc.

// The = sign is an assignment operator that works from RIGHT to LEFT.

// Some special operators are += and -=.

// Computers follow PEMDAS!

//You can add strings with "concatenation" operation
public class Operators {
  
  
  public static void main(String[] args) { 
    
    // An example of concatenation:
    String StrA = new String("Hit or miss- ");
    String StrB = new String("-I guess they never miss, huh?");
    String StrC = new String (StrA + StrB);
    System.out.println(StrC);
    
    int Num = 25;
    System.out.println("\n" + Num);
    Num += 10;
    System.out.println(Num);
    
    // The "And" operator has higher precedence (Higher up in "PEMDAS") than "Or"!
    
  }
  
  
}
