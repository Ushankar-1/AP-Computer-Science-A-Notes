package com.notes.ArrayList;

import java.util.ArrayList;

/**
 * Auto Generated Java Class. 6/27/19-6/29/19
 */
public class ArrayLists {
  
  public static void main(String[] args) { 
    
    // ArrayLists differ from arrays in that you can add and remove objects from the array,
    // and the AL's size changes.
    
    // ALs are an object of the ArrayList prebuilt class in Java.
    // To declare an AL object:
    
    // ArrayList<classname> nameArrayList = new ArrayList<classname>();
    // An initial capacity (this can change!) may be included in the parentheses.
    //ex:
    
    ArrayList<String> knittingList = new ArrayList<String>(4);
    // Didn't seem to work until I imported? Never mind, it's not in java.lang.
    
    // YOU WILL *NOT* NEED IMPORT STATEMENTS ON THE AP EXAM.
    
    // Alternately:
    
    // List<String> ovenList = new ArrayList<String>(4);
    
    // Commented because it doesn't seem to work without an import 
    // of the "List interface" or something. Idk.
    
    
    
    // ALs always start out empty.
    // They're generally better than 1D or 2D arrays because they can expand and shrink.
    
    // However! They can only store OBJECTS, not primitive variables like int.
    // If you want to use them in an AL, you must first wrap them in a wrapper class. ex:
    
    ArrayList<Integer> myRegrets = new ArrayList<Integer>();
    int numRegrets = (int) ((100 * Math.random()) + 2);
    myRegrets.add(numRegrets);
    
    System.out.println("I have "+myRegrets+" regrets.\n");
    
    // AL methods: You won't need to know ALL of them for the AP exam.
    // Check the AP Java subset to see which are important for you to know.
    
    // There are the add(); size(); remove(); get(); and set(); methods.
    
    // There are 2 kinds of add(); :
    // add(E object) appends E object to the end of the list.
    // (E just stand for "every, or "any" class of object.
    
    // It also returns the value TRUE. The AL's size automatically updates to show
    // that an object has been added.
    
    // ex:
    
    knittingList.add(new String("I can make a scarf.")); // index 0
    knittingList.add(new String("")); // index 1, which is EMPTY, not null.
    knittingList.add(new String("")); // index 2, see above.
    knittingList.add(new String("")); // index 3, see above.
    
    // The other kind of add(); uses two arguments.
    // .add(int index, E object);
    // This adds the object into the index at the given position.
    // If anything was already there, it is NOT overwritten. It is just
    // moved one index number to the right. (+1)
    // Unlike the first one, this add(); does not return a value!
    
    knittingList.add(1, new String("I can make a hat."));
    
    // The size(); method returns the number of objects in an AL.
    // This is basically the highest index number plus one. ex:
    
    int lengthList = knittingList.size();
    System.out.println("My knitting list currently has "+lengthList+" items.");
    
    // And here's the remove(); method.
    // The only argument is the index. It returns the reference of the removed object!
    // This method deletes the object at the specified index, and everything after it moves
    // down one index.
    
    // For example, if you had four rocks, and threw out the second one, now you would 
    // only have 3 rocks, the first would still be the first, but the old third one 
    // would now be second and the old fourth one would now be third. See?
    
    String refLocEmpty = knittingList.remove(2);
    
    // Now the AL has only 4 ojects, and refLocEmpy points to the removed one!
    lengthList = knittingList.size();
    System.out.println("\nNow my knitting list has "+lengthList+" items.\nI removed the empty string here:"+refLocEmpty+".");
    
    // The get(); method also returns the reference of an object at the specified index,
    // but it doesn't remove it! It just makes a copy. 0 <= int index < .size();
    // Example at line 122.
    
    // The set(); method has two arguments again: (int index, E object)
    // It replaces the object at the specified index with E object
    // AND, it returns the reference of the object that got replaced! It's not gone forever!
    
    refLocEmpty = knittingList.set(2, "I can make breakfast.");
    refLocEmpty = knittingList.set(3, "I can make mittens.");   
    
    // Both of those were empty so refLocEmpty still points at... nothing.
    
    System.out.println(refLocEmpty);

    System.out.println("You have got to love knitting needles!");
    for (String listItem : knittingList) {
      System.out.println(listItem); }
    // Keep in mind that the temporary variable must be the same datatype as the AL stuff!
    
    System.out.println("\nUhh... what was that middle part?\n");
    
    int midNum = 1;
    String middle = knittingList.get(midNum);
    
    System.out.println(middle+"\n");
    
    
    
    // A compare/contrast note: IMPORTANT
    
    // A length FIELD finds the # of slots in an array.
    
    // A size METHOD finds the # of objects in an ArrayList (since those are dynamic.)
    
    // A length METHOD finds the # of characters in a string.
    
    
    
    // You COULD just use the AL name to print it out, but the formatting sucks. Only for ALs!
    System.out.println(knittingList);

    
    
r  }
}
