/**
 * Auto Generated Java Class.
 */

// Lesson 06.03: Creating a Class.
// And Lesson 06.04: Instantiate an Object

// Formal parameter - what we use inside the parameter list of a constructor to 
// receive a value
// Actual parameter - used inside the constructor code block

// THE TWO ACCESS MODIFIERS TESTED ON THE AP EXAM ARE PUBLIC AND PRIVATE
// A CLASS MUST BE PUBLIC FOR OTHER CLASSES TO USE IT
// INSTANCE VARIABLES SHOULD BE PRIVATE
// A PARAMETERIZED CONSTRUCTOR IS NEEDED IF VALUES MUST BE ASSIGNED TO THE
// INSTANCE VARIABLES WHEN CONSTRUCTING AN OBJECT
// A CLASS CAN HAVE AS MANY CONSTRUCTORS AS NECESSARY
// FORMAL AND ACTUAL PARAMETERS WORK TOGETHER TO PASS VALUES

// REFERENCE VARIABLES ARE NOT OBJECTS THEMSELVES!!! THEY'RE LIKE GOOGLE MAPS!!
// THEY TAKE YOU TO THE OBJECT!!

public class Classes {
  // We're making a "cat" object as an example
  private int catAge;
  // Each time we create a cat object with this constructor, it will 
  // automatically have these instance variables and their values.
  
  
  
  public Classes() { 
    // Constructor code goes here. Constructor name = class name.
    // We're using a no-parameter constructor here. So the parentheses are empty.
    // Because of this, the actual parameter catAge is initialized to the default 0.
    
    // If no constructor code is built, it is understood that the class has a 
    // no-parameter constructor like this one.
    // It looks like the Dr.Java IDE doesn't let you see the code that's actually there.
    // It's still important to build some, just like with the class code.
    // If you built another constructor for the class, the "invisible" default
    // constructor code goes away, it self-destructs.
    // Java's nice that way. In some other languages, we need to build a destructor.
    // Destruction is automated a lot in Java, so be careful.
    
    // Now, to build a parameter rise constructor by copypasting our no-argument
    // (AKA "constructor") code.
    // Then, copypaste and add parameters/arguments to the second constructor
    // (See below)
  }
  
  
  
  public Classes(int age) /* Added formal parameter */ {
    catAge = age; // catAge is an instance variable
    // This constructor creates (instantiates) an object of the Classes class
    // that uses the formal parameter int age. When an object is created, a value
    // in the parameter is passed to the object's instance variable, catAge.
  }
  
  
  
    // Methods are important!!! This is where programming gets its power.
    // Methods can perform a service or return a variable. 
    // The former type is called a "void" method. Spoopy!
    // The latter is a return method.
    // We want to build the method within the curly brackets of our class, but
    // outside the main function and away from the instance variable(s).
    // Let's put method #1 here, below the last constructor:
  
  public int getAge() {
    return catAge;
    // This is an "assessor" method, or a return method.
  }
  
  // Method #2:
  
  public void setAge(int age) {
    catAge = age;
    // A void method, similar to constructor code.
    // If the instance variables can change after they're created, this method, 
    // called the "setter," can change the values.
  }
  

  public static void main(String[] args) { 
    
  // To instantiate an object:
  Classes myCat = new Classes();
  // When creating a class, we've essentially created a new data type!
  // myCat is the reference variable of the object. It's not the object itself,
  // but like a primitive variable, it holds the value.
  // Keyword "new" tells constructor to instantiate an object
  // The second "Classes" calls the (no-parameter in this case) constructor code 
  // of our class.
  
  // To call the parameterized constructor:
  Classes yourCat = new Classes(3);
  // Since we know this new object has a value, use this constructor, and add the
  // age as an argument. Your cat is 3 (presumably, years) old!
  
  // The computer knows which constructor to use because the no-argument one expects...
  // ...well... no argument. The parameterized one expects... well... a parameter.
  
  // Let's use these new reference variables to run a class method:
  
  System.out.println("Your cat is " + yourCat.getAge() + " years old!");
  
  // How to get a NullPointerException:
  // Change the reference variable to null, so your computer can't find the object.
  
  yourCat = null;
  System.out.println("\nCue NullPointerException...\n");
  System.out.println("Your cat is " + yourCat.getAge() + " years old!");
    
  }
}


