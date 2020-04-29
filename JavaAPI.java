
import java.lang.Math;
import java.lang.Integer;
import java.lang.Double;

// Done in steps between 7/7/19 and 7/23/19. (sobs)
// I'm actually going to kill myself if I screw up this much again

public class JavaAPI {
  
  public static void main(String[] args) {
    /* Lesson 08.01: Java API
     
  The main point: Don't reinvent the wheel! Libraries are everywhere. 
  
  A library is a collection of resources, including not just source code but also config
  info, documentation, and sample implementations.
  In Java, libraries are implemented as packages. You need this keyword to use one.
  
  What is a package? Packages are collections of classes.
  The package keyword provides a way to organize classes into "namespaces" in Java.
  
  Namespaces are like supercategories. A genus is a namespace to species. 
  
  Java packages can be used as straight source files, or they can be compressed
  in JAR files, letting them dowload faster.
  
  Java has inbuilt packages. Anything inside the Java.lang package is the Java API.
  (API stands for Application Programming Interface. It's a set of defined useful stuff.)
  
  A good API simplifies software development by showing how to use these pre-built things.
  There are tons of APIs, but the main one for this course is the Java API.
  All questions on the AP Exam can be answered with the provided AP Java subset.
  
  The Java API is huge, and you won't need to memorize it for the exam.
  REMEMBER THAT.
  
  The package declaration, if any, must be on the very first line of a class file.
  
  Lesson 08.02: Math Class
  
  Important methods from the math class of the AP Java subset:
  - abs() [absolute value]
  - sqrt() [square root, only works on numbers >= 0]
  - pow() [base raised to a power]
  - random() ["random" number generator - again, don't try and use this for anything that needs
  actual random numbers!]
  
  Note: An important difference between the math class and the rest (???) of the AP Java
  Subset is that the math class has only static methods - meaning you don't need to make an 
  object to use these!
  
  Just call a math method with the following format:
  variableType variable = math.methodName()
  
  ex:
  */
    
  int ans = Math.abs(-10);
  double ans2 = Math.abs(-10.2);
  System.out.println(ans +" and "+ans2);
  
  // sqrt() example: (output is always double)
  
  double ans3 = Math.sqrt(2);
  System.out.println(ans3);
  
  // pow() example: (output is always double)
  
  double ans4 = Math.pow(2,3);
  // 2 to the 3rd power
  System.out.println(ans4);
  
  // The java.lang.Math random function is inferior to the java.util. It returns a double
  //that is >= 0.0 and < 1.0.
  
  double ans5 = Math.random();
  System.out.println(ans5);
  
  // However, this double value can be modified to fit any range!
  // Just try some arithmetic operations to shift its range left or right (- or +)
  // or expand/shrink (* or /) it.
  
  //Ex: To get an double between 0 and 10, inclusive:
  // Remember the random function can never spit out 1.0
  
  double rand1 = (Math.random() * 11);
  System.out.println(rand1);
    
  // To get an int between 0 and 10, inclusive, cast the method to an int:
    
  int rand2 = (int)(Math.random() * 11);
  System.out.println(rand2);
  
  // To get an int between -11 and 685, inclusive:
  
  int rand3 = (int)((Math.random() * 697) - 11);
  System.out.println(rand3);
  
  // When comparing doubles, never use the == operator!
  // That might cause rounding errors. Instead, see if they're close enough to be equal.
  // Use a "tolerance factor." For example, a tf of 0.1 means that 1.92 and 1.93 are equal.
  // Observe:
  
  double TF = 0.1;
  double num1 = Math.random();
  double num2 = Math.random();
  
  if(Math.abs(num1-num2) <= TF) {
    System.out.println(num1+" and "+num2+" are equal."); }
  else {
    System.out.println(num1+" and "+num2+" are NOT equal."); }
  
  // Lesson 08.03: Integer and Double classes
  
  // Wrapper classes can convert ("wrap") a primitive variable type (like int) into an object.
  // The Integer and Double classes are these.
  
  // Using the Integer class as an example, it can also convert an Integer object
  // back into a primitive int with the intValue() method.
  // Syntax:
  
  int age = 15;
  Integer myAge = new Integer(age);
  // myAge is an object with the value 15
  
  int alsoAge = myAge.intValue();
  // alsoAge is a primitive int with the value 15
  
  // ***THE FUNCTION OF WRAPPER CLASSES WILL BE DISCUSSED LATER.***
  
  // Don't use a double valuem or ANY non-int value, to make an integer object!
  // You will get a compile-time error.
  // Also please use A value. If no value is established, same error.
  
  // 2 important fields, like instance variables, of the Integer class are:
  // MAX_VALUE and MIN_VALUE
  
  // These are constant fields, and CANNOT be changed during runtime.
  // They must be named exactly as they are typed above, capslock, underscore, and all.
  
  // These are needed because for integers, the largest value that can be stored is
  // 2,147,483,647. Go over that and you get an overflow error - not a runtime error!
  
  // That means your program would just mess up instead of crashing so you wouldn't
  // know anything is wrong.
  
  // Note: since these are fields, no parentheses after them.
  
  int highest = Integer.MAX_VALUE;
  System.out.println("\nMAX_VALUE is "+highest);
  
  int lowest = Integer.MIN_VALUE;
  System.out.println("\nMIN_VALUE is "+lowest);
  
  
  
  
  }
}