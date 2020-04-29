import java.util.Scanner;

public class Input_Lesson
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    String name;
    System.out.println("What is your name?" );
    name = scan.nextLine(); //Scans the user input as an int.next.Line method
    
    /*if collecting an integer value instead of a String, use scan.nextInt() 
    *instead of nextLine()
    */
    
    System.out.println("What is your age?");
    int age = scan.nextInt();
    System.out.println("You told me your name is " + name + " and your age is " + age + ".");
  }
}