/**
 * Auto Generated Java Class.
 */
public class LogicalOperations {
  
  
  public static void main(String[] args) { 
    
    // Lesson 5.02 - Logical Operations.
    // Truth Table, short cicuit evaluations, and DeMorgan's law
    
    // When a truth table would be used: 
    // (truth table says && = FALSE when either is false, || = FALSE when both are false)
    
    // Using the example of a card game that ends when one player is out of cards:
    
    int player1Cards = 0;
    int player2Cards = 3;
      
    boolean gameOver = (player1Cards == 0 || player2Cards == 0);
      
    if(gameOver == true) {
      System.out.println("Game over!\n");
    }
    
    int a = 0;
    int b = 2;
    int c = 4;
    
    System.out.println("1st function: " + (a >= 0 && c % 2 == 1)); 
    // First condition is true, second is false, so all FALSE
    
    System.out.println("2nd function: " + (b == 3 || (c-2) == b)); 
    // 1st condition false, second true, so all TRUE
    
    System.out.println("3rd function: " + (a == 0 && b == 3 && (c == 4)));
    // 2nd false, 1st and 3rd true, so all FALSE
    
    // Short-circuiting an evaluation: If ANYTHING in a && conditional statement is
    // false, then the whole thing is false. Likewise, if ANYTHING in a || is 
    // true, then the whole thing is true.
    
    // DeMorgan's law: Remember the algebra Distributive Property?
    // !(y && z) == !y || !z
    // !(y || z) == !y && !z
    // You can distribute the "!" operator to all conditionals, switching the 
    // && and || operators in the process!
    
    int x = 5;
    int y = -2;
    boolean eval = !(x != 4 || y >= 8); // x == 4 || y < 8. 1st false, 2nd true
    System.out.println("\nDeMorgan's law: " + eval);





    // Runtime errors: Your computer will barf on you if you attempt to perform
    // the mathematically impossible. Like dividing by zero.
    
    System.out.println(5 % 0);
    
    // This leads to an arithmetic exception!
    
    
    
    
    
    
    
    
  }
}
