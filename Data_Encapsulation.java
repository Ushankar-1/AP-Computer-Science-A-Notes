/**
 * Auto Generated Java Class. 8/5/19 to 8/6/19. Lessons 13.01-13.02
 */
import java.util.Scanner;

public class Data_Encapsulation {
  
    private int age; // Instance variable
    private static int tries = 1; //class instance variable
    
    public void setAge(int agee) { // Parameter variable
      age = agee; }
    
    public static void addTries() { // adds one to tries
      tries++;}
    
    public static int getTries() { // getter for static variable
      return tries; }
  
  public Data_Encapsulation() {}
  
  private class Inner_Class {
    // Private or protected is ok!
    Inner_Class() {}
  }
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // Lesson 13.01: Data encapsulation
    
    /* Scope, static, and data encapsulation are all related.
     * All deal with what program parts are able to access what data.
     * 
     * The scope is where the variable is used, and therefore, what part can access it.
     * A local variable is only recognized within the nearest curly brackets.
     * If you attempt to use a variable outside its scope, you get a compile time error.
     * 
     * Instance variables (ex: the stuff at the top of the class constructor)
     * have a larger scope. They're accessible by any method in their class.
     * 
     * The scope of a parameter is the method or constructor where it is declared.
     * 
     * Instance variables can be used by any object and take on a value specific to 
     * that object/instance.
     * 
     * If we wanted to make a variable shared by all objects in a class, if it changed for
     * one object, it wuold change for all of them.
     * WE CAN DO THAT! Just add 'static' in front to designate it as a class instance variable.
     * 
     * Let's see a use of this to count how many tries it takes for someone to answer
     * a math problem right.
     * See the below and lines 9 and 14-18.
    */
    
   
    System.out.println("What is 2 plus 2?");
    String ansr = scan.nextLine();
    
    boolean tF1 = ansr.equals("4");
    boolean tF2 = ansr.equals("four");
    boolean tF3 = ansr.equals("Four"); 
    boolean tF4 = ansr.equals("FOUR");
    
    boolean tF = tF1 || tF2 || tF3 || tF4;
    
    while (tF == false ) {
      addTries(); 
      System.out.println("What is 2 plus 2?");
      ansr = scan.nextLine(); 
      tF = ansr.equals("4");
      }
    
    if (tries == 1) {
      System.out.println("It took you only 1 try to correctly solve (2+2). Good job!"); }
    else {
      System.out.println("It took you only "+getTries()+" tries to correctly solve (2+2). Good job!"); }
    
    
    // A static marked method can only call other static methods and use static variables!
    
    // All classes and objects within are public, so we use access modifiers to encapsulate.
    
    // ON THE AP EXAM, ALL INSTANCE VARIABLES OF A CLASS ARE DECLARED PRIVATE.
    // The only way to access these are through the setter and getter class methods!
    
    // About class access:
    /* modifier:  class -- package -- subclass -- world
     * public:      Y   --    Y    --    Y     --   Y 
     * protected:   Y   --    Y    --    Y     --   N  
     * no modifier: Y   --    Y    --    N     --   N  
     * private:     Y   --    N    --    N     --   N  
     * */
    
    // No modifier is default.
    
    // Having a method marked private in an extendable, non-final class makes the method
    // effectively final, as if it was marked with a "final" keyword.
    
    // This is because subclasses, including child classes, can't see or overrule the method.
    
    // Public methods are private instance variables are good!!! Use them all the time!!!
    
    // THE PUBLIC AND PRIVATE KEYWORDS ARE ON THE AP JAVA SUBSET.
    // (protected and package no modifier access levels are not.)
    // But you still need to understand them to get how visibility works in Java.
    
    // Using "protected" stops classes outside the package from using the method,
    // UNLESS a class in another package extends your class with a protected method.
    // Then it will have access anyways, even though it's technically out in the world.
    
    // This does not apply for "no modifier"/"none."
    // Only the package gets to see these.
    
    // The AP exam won't test this tiny detail, but it's important!
    
    
    
    // Private means "only accessible to the class its defined in." No cuts, no buts.
    // If you need to break something big into small chunks of work, use these!
    // They become "helper methods," that cannot and should not be accessible outside
    // of the context of the larger procedure (which would be public).
    
    // Maybe an example is in my "computer-guesses-the-number" game. The "too high/too low"
    // thing could easily be made into a private function, ready to be called over and over
    // again, but is pointless outside of this particular program.
    
    
    
    // You CAN have multiple classes in a single file - the video has these!
    // BUT this is not a good way to do things in practice.
    
    // But say you had these, and the classes had the default access modifier - none.
    // Multiple classes in a file are a good way to learn how access modifiers work.
    
    // The first thing that decides what you can and can't do is the JavaCompiler.
    // It only lets you have ONE public class per file.
    // (In this case, Data_Encapsulation)!
    
    // The rest must be non-public. Could this mean private?
    
    // Private means "ONLY visible to the enclosing class."
    // So, this can only apply to class member variables and methods.
    // So it can't even be accessed by the class(es) it shares a file with.
    // Which, by definition, are in the same package!
    
    // So in a file with a public class, non-public classes can't be marked private.
    // It wouldn't make any sense, as the JavaC will make very clear.
    
    // Could it mean protected?
    // It could be accessed within the package and subclasses, but not from ANYWHERE.
    // Apparently this makes things messy.
    
    // THEORETICALLY, the class could be subclassed outside the package.
    // But it's not visible outside the package.
    // So it's really only capable of "package protected," ie "no modifier" default access.
    
    // So "protected" isn't valid either, and the JavaC will scream at you if you try.
    
    // So we can only have public and default "none" top-level classes.
    // A top-level class is not enclosed in any others.
    
    // Non-top-level classes are called "nested" or "inner" classes.
    // They are defined inside what's enclosed in another class.
    //See lines 22-25.
    
    // Not just in the same file as, but actually WITHIN the curly brackets to define a class!
    
    // Because they HAVE an enclosing class, the other non-public access modifiers
    // make sense for them!
    
    // Nested classes aren't on the AP Exam, but understanding them helps you
    // understand access modifiers.

  }
}

// Lesson 13.02: Documentation

// Comments explain the how, why, and assumptions behind a particular piece of code.
// They also clarify complex bits. Remember how fast you forgot your Python programs?
// It is absolutely CRITICAL on shared projects!

// These types of comments are for short notes on or above the lines you're referring to!
// There's also something about the "TODO," which marks places that need work.
// Many IDEs will make a list of them for you.

/* This is a multi-line, or C-style, comment. It opens with a /* and ends with a */

// NEVER!!! NEST!!! COMMENTS!!! It screws with your code.

/** Javadoc comments look almost like
  * multiline comments, except they have 
  * two asterisks at the opening.
  * Also, the closing "* /" should be
  * put on a separate line.
  * The javadoc tool can now print this 
  * out as a web document that provides 
  * information about your software. */

// (Apparently that wasn't a javadoc comment ^^.)
// (Whatever. That's what it's supposed to look like anyways.)

// The 3 opening characters (/**) tell the compiler that the comment is a javadoc
// and allows developers to specify descriptive tags like @params and @returns.

// Javadoc is used to make a user guide for programmers and members 
// (members are variables and methods).

// You'll see this in the course and on the AP exam.

// Remember! Variable and method names can be as descriptive as needed!
// Memory is far from an issue! Make them as wordy as you want!

// Remember: The better something is made, the less external documentation (ex: FAQs, etc.)
// it needs!






































