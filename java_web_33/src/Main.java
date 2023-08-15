public class Main {
    // Final
    final int x = 10;
    final double PI = 3.14;
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args) {
        Main myObj = new Main(); // Create an object of Main
        //myObj.x = 50; // cannot assign a value to final variable x
        //myObj.PI = 25; // cannot assign a value to final variable PI
        System.out.println(myObj.x);
        myStaticMethod(); // Call the static method
        //myPublicMethod(); // non-static method myPublicMethod() cannot be referenced from a static context
        myObj.myPublicMethod(); // Call the public method
    }
}