/**
 * Auto Generated Java Class. 6/23/19-6/25/19
 */
public class Arrays {

  public static void main(String[] args) { 
    
    // Lesseon 09.01: Arrays
    
    // The 3 data structures on the AP exam are 1D arrays, 2D arrays, and ArrayLists.
    
    // 1D Arrays: (ex: days of week)
    // Arrays are data structures, which are used to store info.
    // A simple data structure is when you declare a single variable and assign ONE value.
    // Arrays are more complex because they hold lists of them. 
    
    // Values in an array are called Elements.
    
    // You can declare and initialize an array in one line of code: the array initializer.
    
    String[] superTeam = {"Friendship", "Harmony", "Incredible Violence", "Love"};
    
    // The square brackets [] tell the computer that this variable references an array!
    
    // There's also the 3-step method:

    int[] sameNumber; // Declare the array
    sameNumber = new int[5]; // Create the array
    for (int i = 0; i < 5; i++) { // Elements are indexed from 0 to (5-1)
      sameNumber[i] = 0; } // Initialize all elements to 0
    
    // This is a "for each" (see below) loop printing each int in this array.
    
    System.out.println("This array has 5 slots that all have the value 0.");
    for (int num : sameNumber) {
      System.out.println(num); }
    
    // Each element is assigned an index, starting with 0. The last element is the
    // length of the array minus 1.
    
    // So "Friendship" would be 0 while "Love" would be 3.
    
    // Any data type you can use to make a variable, you can use to make an array.
    
    // Array lengths are fixed. To find how many slots it has, regardless of whether 
    // they are open or filled, use this field:
    
    int result = superTeam.length;
    System.out.println("\nThe array superTeam has this many slots: "+result);
    
    // Remember that the last index of an array is length-1.
    // If you try and access any index not in the array,
    // you get an ArrayIndexOutOfBoundsException.
    
    // You can "traverse" (move across) an index from first to last, last to first,
    // all odds, all evens, etc.
    // Most common way to traverse is with a for loop.
    
    System.out.println("\nWe will stop you! With the powers of...\n");
    for (int i=0; i < superTeam.length; i++) {
      if (i != 3) {
        System.out.println(superTeam[i]+"!"); }
      else {
        System.out.println("Aaaand "+superTeam[i]+"!"); }    
    }
    
    // There's also something called an enhanced for loop - a "for each" loop
    // It starts at the beginning of an array and continues until the end,
    // creating a temporary variable for each that takes each element as its value.
   
    System.out.println("\nAgain, our powers are...");
    for (String power : superTeam) {
      System.out.println(power);
    }    
    
    // Remember! Arrays are objects, and more info on them can be found in the Java API.
    
    
    
    // Lesson 10.01: 2D Arrays
    
    // Like 1D arrays, the data type must be the same for everything inside!
    // Think Battleship: You use coordinates to get to the target point.
    // It's arrays within arrays, like points within rows/columns.
    
    // To declare:
    
    String[][] battleshipCoordinates = { {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"}, {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"} };
    // In case you don't feel like scrolling, it's just A-J (columns) and 1-10 (rows)
    
    // This means print everything in the first set of inner {}, which is row 0.
    // See below for more explanation.
    for (String coordinate : battleshipCoordinates[0]) {
      System.out.println(coordinate); }
    
    // Obvs, like everything in Java, first positions are 0, second positions are 1, etc.
    // Each inner curly brackets is a row, and the position of each element in one is a column.
    // ex: "C" would be in row 0, column 2. In that order.
    // For the heck of it, let's change it to "S".
    
    System.out.println("\n\n\n");
    battleshipCoordinates[0][2] = "S";
    for (String coordinate : battleshipCoordinates[0]) {
      System.out.println(coordinate); }
    
    // Creating a 2D array with the 3-step method:
    
    String[][] punnetSquare;
    punnetSquare = new String[2][2]; // Remember, 2 rows means rows at positions 0 and 1
    // This one is blank for now.
    
    // Side note: the char datatype is notated with '', not "" like with String.
    
    // You can use the length field in a 2D array to find the number of rows and columns.
    // You can find the rows with just the lengh field.
    // However, to find the # of columns, use the length field on the array name AND a row.
    
    
    
    int rowResult = punnetSquare.length; 
    int colResult = punnetSquare[0].length;
    System.out.println("\nThis array has "+rowResult+" rows and "+colResult+" columns.");
    
    // Lemme fill it in quickly. Assuming it's a double-heterozygote cross:
    
    punnetSquare[0][0] = "PP";
    punnetSquare[1][0] = "Pq";    
    punnetSquare[0][1] = "Pq";
    punnetSquare[1][1] = "qq";
      
    // It doesn't matter which row you use to get colResult!
    // What matters is that you know how many rows there are so you don't try and use
    // a row that's too big or otherwise not in the array and get stuck with an Exception.
    
    // There are many ways to traverse a 2D array, but 2 are on the AP exam.
    
    // Row-major order: left to right, and when the end of the row is reached, top to bottom.
    
    // Use a nested for loop:
    
    System.out.println("\n\n\n");
    for (int row = 0; row < punnetSquare.length; row++) {
      for (int col = 0; col < punnetSquare[0].length; col++) {
        System.out.println(punnetSquare[row][col]); }}
    
    // There's also column-major order:
    
    System.out.println("\n\n\n");
    for (int col = 0; col < punnetSquare[0].length; col++) {
      for (int row = 0; row < punnetSquare.length; row++) {
        System.out.println(punnetSquare[row][col]); }}
    
  }

  
}
