/**
 * Auto Generated Java Class. Lesson 13.03. 8/8/19.
 */
public class OOP_Example {
  
  public OOP_Example() { 
  }
  
  class Pet {
    protected void foodOrdered() {} // Was protected boolean in example;
  } // Changed it to 'void' because couldn't think of anything to return
  
  class Parrot extends Pet {
    public boolean foodOrdered(String store) {
      boolean shippedSuccess = true;
      //TODO: Generate email/call using store
      //TODO: queue email
    //TODO: Wait for email/call send status
      return shippedSuccess; }
  }
    
// There are 2 classes: Pet and Parrot, identifiable with the class keyword.
// The keyword extends tells Java to take everything it knows about one class and let the
// other class inherit it. This is used for IS-A relationships.
  
// The empty Pet method foodOrdered() is a reminder for subclasses to handle the task.
// It's just a placeholder for something that must be defined for each specific case.
// Omnivores would likely define the method differently.
// When the method is in Parrot, it's not empty and is specific to the class.
  
// But this is a tiny example with class snippets. 
// The main point is, no lowly employee would know or care about the internal processes
// of this tedious task. They just get to press a button and it does it for them.
  
// Encapsulation, which includes hiding all of this complexity, is key in OOP.

    
  
  public static void main(String[] args) { 
    
    /* In this lesson, we cover classes, objects, and inheritance with the IS-A relationship.
     * 
     * Imagine classifying vehicles into cars, motorcycles, boats, helicopters, and planes.
     * Each vehicle has characteristics like number of wheels or weight that let them
     * fit logically into a certain class.
     * Also, things like numWheels or weightLbs can be stored as ints and doubles.
     * 
     * Using a pet store as an example, fish and amphibians, and dogs and cats, and birds
     * and reptiles, are typically kept together as they have similar qualities and needs.
     * 
     * Cats, dogs, and rodents are all mammals. 
     * This is a IS-A relationship.
     * 
     * Why are they mammals? They all give birth, feed their young milk, and have fur/hair.
     * This is a HAS-A relationship.
     * 
     * IS-A is for classes.
     * HAS-A is for characteristics.
     * 
     * Ex: A macaw IS-A bird because it HAS-A beak.
     * HAS-A relationships will be expanded upon later.
     * 
     * Classes can have extensive class hierarchies.
     * Dogs is a class, as is Mammals, as is Pets, as is thingsInThePetStore.
     * 
     * These classes all inherit things from each other - Dogs has Mammals qualities!
     * 
     * (All classes in Java except Java.lang.Object have a superclass.)
     * 
     * Any class can only have ONE parent class.
     * 
     * (Multiple inheritance, like with kids and parents, does not work the same
     * way in Java's OOP. It's handled differently and will be discussed later.)
     * 
     * 
     * 
     * But it's OOP, not Class OP, because classes aren't the end of the line: Objects are.
     * 
     * Imagine Pumpkin, the dog object, and Waffles, the parrot object, up for
     * adoption in the pet store.
     * 
     * They are objects of the Dog and Parrot classes respectively.
     * 
     * But Pumpkin, for example, is not just a Dog. She is also a Pet and Omnivore.
     * 
     * What do all Omnivores have? Probably a foodItems and nutrientNeeds.
     * What do all Pets have? Probably a price and healthStatus.
     * What do all Dogs have? Probably a size variable.
     * 
     * Pumpkin inherits all these things from each successive class.
     * 
     * Say you're an employee of the pet store.
     * Some things you might have to do are order pet food, clean the store, and wrestle
     * some of the livelier pets.
     * 
     * You clearly need to know a lot about the store to do these - but OOP facilitates this.
     * Whoever made the store's inventory app can make methods to do all these in the classes.
     * ex: Ordering pet food
     * 
     * Let's say that you need to order collars from an online shop and the local zoo
     * for the reptiles. The shop takes emails, but you need to call the zoo.
     * 
     * See lines 9-20.
     * 
     * 
     * 
     * Last section of the lesson: UML (Unified Modeling Language)
     * It's a set of conventions for a standard method to represent system design.
     * 
     * It uses boxes and arrows to show how one plans to use classes in a neat and clean way.
     * Each box is a class. The top shows the class name. The middle section shows the
     * classes' qualities/instant variables. The bottom shows the methods.
     * */
     
  }
}
