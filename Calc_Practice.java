

public class Calc_Practice
{
  public static void main(String[] args)
  {
    System.out.println("2 + 2 is " + 2+2);
    System.out.println(10-7);
    System.out.println("9 times 8 is " + 9*8);
    System.out.println("4 divided by 2 is " + 4/2);
    
    int num1 = 2;
    int num2 = 5;
    
    System.out.println("\nnum1 = 2 and num2 = 5.");
    
    System.out.println("num1 + num2 = " + num1+num2);
    System.out.println(num1-num2);
    System.out.println("num1 times num2 = " + num1*num2);
    System.out.println("num1 divided by num2 = " + num1/num2 + 
                       "\nbecause integers are truncated in Java.");
    
    double num3 = 4;
    double num4 = 7;
      
    System.out.println("\nnum3 = 4 and num4 = 7. num3 divided by num4 \nis " + num3/num4 + 
                       " because I used doubles this time.");
    
    // Unary operators. Only used as postfixes (like here) in APCSA.
    num1++;
    num2--;
    System.out.println(num1);
    System.out.println(num2);
    System.out.println("\nThe value of num1 was increased by 1, and num2 was decreased by 1.");
    
    // Prefix Unary operators
    ++num3;
    --num4;
    System.out.println(num3);
    System.out.println(num4);
    System.out.println("\nnum3 was still increased by 1, and num4 was still decreased by 1.");
    
    double result = num4 % num3;
    System.out.println(result);
    System.out.println("\nModulus, or %, gives the remainder of a division operations.\nFor example, the difference when num4 (7) is divided by\nnum3 (4), the answer is one, but the remainder, 3, is printed.\nIt can be used to check if a number is even or odd.");

    System.out.println("\nnum1 is now " + num1);
    num1 += 4;
    System.out.println("num1 is now " + num1 + ".\nThe +=, -=, *=, and /= are useful shortcuts.");
                       
    
    System.out.println("\nnum4 is now " + num4);
    num4 %= 4;
    System.out.println("num4 is now " + num4 + " because if num4 = 6, then\n6 divided by 4 = 1, with a remainder of 2. Since 2 is the remainder, num4 now equals 2.");
    
  }
}