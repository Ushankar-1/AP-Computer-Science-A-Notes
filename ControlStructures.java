/**
 * Auto Generated Java Class.
 */

import java.util.Random;

public class ControlStructures {
  
  
  public static void main(String[] args) { 
    
    // Lesson 05.03. Control Structures: Conditionals (if), loops (while)
    // Also, printing to Terminal, console, etc? Get used to this?
    
    // Using "else":
    
    String passFail;
    
    // I really wanted to use random numbers even if they weren't in the lesson 
    // So I did a bit of googling
    
    Random rand = new Random();
    int numGrade = rand.nextInt(101);
      
    if(numGrade < 90) {
      passFail = "Fail"; } 
    else {
      passFail = "Pass"; }
    
    System.out.println(passFail);
      
    // The {} with if and else statements define which lines are related, or the "scope."
    // More complex: A letter grading system. The grade is "I" for "Incomplete"
    // until the grades are entered.
      
    // elif in Python is else if in Java
      
    numGrade += 50;
    // Just to make it more fun
    
    if(numGrade >= 90) {
      String letterGrade = "A"; 
      System.out.println(letterGrade); }
    else if(numGrade >= 80) {
      String letterGrade = "B";
      System.out.println(letterGrade); }
    else if(numGrade >= 70) {
      String letterGrade = "C";
      System.out.println(letterGrade); }    
    else if(numGrade >= 60) {
      String letterGrade = "D"; 
      System.out.println(letterGrade); }    
    else {
      String letterGrade = "F"; 
      System.out.println(letterGrade); }    
    
    // BTW, this course focuses on While and For loops.
    
    // How for loops work:
    // for (initial condition; loop condition; update) {
    //    loop block code }
    
    // Countdown with a while loop:
    
    int count = 5;
    
    while(count > 0) {
      System.out.println(count + "...");
      count--; }
    System.out.println("BLASTOFF!\n\n\n");
    
    // Countdown with a for loop:
    
    for(int count2 = 5; count2 > 0; count2--) 
    {System.out.println(count2 + "..."); }
    System.out.println("BLASTOFF!\n\n\n");
    
    // An overview of print commands
    
    System.out.println("Using 'println' makes a new line after the statement.\n");
    
    System.out.print("I am using 'print' now.");
    System.out.print("No new line is being made at the end.");
    System.out.print("So all these sentences are on the same line.");
    
    
    
    
    
    
  }
}
