/**
 * Another way to achieve abstraction in Java, is with interfaces
 * Interface is a completely "abstract class" that is used to group related methods with empty bodies
 */
interface Animal2 {
    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}

// Pig implements the Animal interface
class Pig2 implements Animal2 {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Main {
    public static void main(String[] args) {
        Pig2 myPig = new Pig2(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}