/**
 * Auto Generated Java Class. 7/31/19 to 8/1/19. Lessons 12.01 and 12.02
 */
public class Parameters {
  
  private String catBreed;
  
  public Parameters() {}
  
  public Parameters(String cbInput) {
    catBreed = cbInput; }
  
  public String getBreed() {
    return catBreed; }
  
  public void setBreed(String cbInput) {
    catBreed = cbInput; }
  
  public static void changeBoth(Parameters cbInput, int age) {
    cbInput.setBreed(" Sphynx");
    age = 2; }
  
  
  
  
  
  public static int[] ageUp(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i]++; }
    return arr; }
  
  public static int[] ageUpBetter(int[] arr) { 
    int[] arr2 = new int[arr.length]; // 
    for (int i = 0; i < arr.length; i++) {  
      arr2[i] = arr[i]; }
    
    for (int i = 0; i < arr2.length; i++) { 
      arr2[i]++; }
    
    return arr2; } 
  
  
  
  
  
  public void doItWithThis(Parameters object) {
    System.out.println("This cat is "+object.getBreed()); }
  
  public void doIt() { //Pass "this" to another method: in this case, the above.
    doItWithThis(this); } // The "this" stands for what's in the () when calling doIt().
  
  
  
  
  
  private int a = 1;
  private int b = 2;
  private int c = 3;
  
  public int setInts(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    
    int d = a+b+c;
    
    return d; }
  
  
  
  public static void main(String[] args) { 
    
    // Lesson 12.01: Parameters/arguments are used to pass values to a method or constructor.
    // Actual parameters are the values passed.
    // Formal parameters are the specific variables in the parameter list.
    
    // If an actual argument is a primitive datatype, it can't be changed in the method,
    // since only the value and not the variable name is passed.
    
    // In other words, a method can only change the formal, not the actual parameters!
    
    // "Primitives are passed by value." "Objects are passed by reference."
    
    // AKA, when a method receives an object reference and stores it in a formal, it can change
    // the state of the object because it knows where to find it. (SEE BELOW AND LINES 6-21)
    
    Parameters cat1 = new Parameters(" Abyssinian"); // Made an object of the Parameters type
    int numCats = 1; // primitive variable
    
    System.out.println("\nBefore calling the method, I have "+numCats+cat1.getBreed()+" cat(s).\n");
    
    changeBoth(cat1, numCats);
    
    System.out.println("After calling the method, I have "+numCats+cat1.getBreed()+" cat(s).\n");
    System.out.println("The number of cats did not change because methods don't change primitive variables.\n\n\n");
    
    // The formal is an alias of the actual.
    
    // Keep in mind that, as objects, Arrays (and ALs?) are also passed by reference!
    
    // NEVER LET A METHOD CHANGE THE STATE OF AN ARGUMENT PASSED TO IT,
    // UNLESS YOU ARE ASKED TO DO SO.
    // THIS WILL DOCK YOU A POINT ON THE AP EXAM.
    
    // It's considered "destruction of persistent data," which is bad.
    // Persistent data is defined as data that is infrequently accessed or modified.
    
    // How to avoid:
    
    // Within the method, make a "temp" (temporary) copy of whatever persistent data you need.
    // Then modify and return THAT instead of said persistent data. 
    
    // What not to do: LINES 27-30
    // What good to do: LINES 32-41
    
    int[] catsAges = {5, 2, 4, 7, 10, 1, 3};
    
    System.out.println("My cats ages are currently:");
    for (int age : catsAges) {
      System.out.print(age+", "); }
    System.out.println("\n");
    
    System.out.println("Now I aged them a year with the good method.");
    for (int age : ageUpBetter(catsAges)) {
      System.out.print(age+", "); }
    System.out.println("\n");
    
    // You could also do something like:
    // catsAges2[] = ageUpBetter(catsages)
    // for (int age : catsAges2) {
    // System.out.print(age+", "); }
    

    System.out.println("That means the old ages are still here!");
    for (int age : catsAges) {
      System.out.print(age+", "); }
    System.out.println("\n"); 
    
    System.out.println("Now I aged them a year with the BAD method.(from the original)");
    for (int age : ageUp(catsAges)) {
      System.out.print(age+", "); }
    System.out.println("\n");
    
    System.out.println("And now the old ages have been permanently changed.");
    for (int age : catsAges) {
      System.out.print(age+", "); }
    System.out.println("\n");

    
    
    // The keyword "this" is often used for parameter confusion.
    // It refers to an object whose constructor is being called. AKA 'implicit parameter.'
    
    // ex: When one method just calls another: (SEE BELOW AND LINES 47-51)
    
    Parameters cat2 = new Parameters("Siamese");
    cat2.doIt();

    // ex 2: When the instance variables and parameters have the same name.
    // SEE LINES 57-68
    
    System.out.println(cat2.setInts(0, 0, 0));
    
    // Just using cat2 as a random object to use the method on.
    // These integers don't really mean anything.
    
    // Point is, this is the important code:
    
    /*   
     * private int a = 1;
     * private int b = 2;
     * private int c = 3;
     * 
     * public int setInts(int a, int b, int c) 
     * 
     * this.a = a;
     * this.b = b;
     * this.c = c;
     * 
     * int d = a+b+c; */
    
    // If the "this" refers to the input, then they'll all be set to 1, 2, and 3.
    // This adds up to 6 in the printed result.

    // If the "this" refers to the private ints, then they'll all be set to 0 by the input.
    // This adds up to 0 in the printed result.
    
    // As you can see, the printed result is 0.
    // SO! "this" refers to the ALREADY INITIALIZED VARIABLES! Not the input!
    // Woulda been nice if the keyword 'this' was clearer imo
    
    
    
    // Overloading: Lesson 12.02. This is an easy lesson!
    // "Overloaded" methods or constructors are when there are multiple of the same
    // method or contructor with different parameters.
    
    // This is when:
    // a) There are different numbers of parameters
    // b) There are different datatypes of parameters
    // c) There are the same number and type of parameters in different orders
    
    // Ex constructor: See lines 8 through 11.
    // The first contructor has no parameters. The second has a String parameter for cat breed.
    // I could also make a constructor like:
    /*
     * public Parameters(String cB, int cA, int nT) {
     * catBreed = cB;
     * catAge = cA;
     * numToes = nT; }
     * */
    
    
    // As for methods, here are some overloaded methods below!
    // They're useful as you can basically use them with any numerical datatype
    // without having to remember the names of different methods!
    
    int x = 3;
    System.out.println("The number is 3. Its opposite is "+cat2.makeItNeg(3)+".");
    
    System.out.println("The number is 4.235235. Its opposite is "+cat2.makeItNeg(4.235235)+".");
    
  }
  
  public int makeItNeg(int a) {
    int b = (a*2);
    int c = (a-b);
    return c; }
  
  public double makeItNeg(double a) {
    double b = (a*2);
    double c = (a-b);
    return c; }
  
}
