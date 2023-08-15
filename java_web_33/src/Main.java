abstract class Main {
    /**
     * JAVA DATA TYPES
     * String - stores text, such as "Hello". String values are surrounded by double quotes
     * int - stores integers (whole numbers), without decimals, such as 123 or -123
     * float - stores floating point numbers, with decimals, such 19.99 or -19.99
     * char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
     * boolean - stores values with two states: true or false
     */
    /**
     * Data types are divied into 2 groups:
     */
    // 1. Primitive data types
    byte myByteNum = 127; // 1 byte stores whole numbers from -128 to 127
    short myShortNum = 32000; // 2 bytes stores whole numbers from -32,768 to 32,767
    int myNum = 5; // 4 bytes stores whole numbers from -2,147,483,648 to 2,147,483,647
    float myFloatNum = 5.99f; // 4 bytes stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    char myLetter = 'D'; // 2 bytes stores a single character/letter or ASCII values
    boolean myBool = true; // 1 bit stores true or false values
    String myText = "Hello";
    /**
     * 2. Non-primitive data types such as String, Arrays and Classes
     */
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // Abstract method
}
// Subclass (inherit from Main)
class Student extends Main {
    public int graduationYear = 2018;
    public void study() { // The body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}