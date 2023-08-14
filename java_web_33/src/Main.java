public class Main {
    // Static method
    public static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    // Public method
    public void myPublicMethod() {
        System.out.println("Public nethods must be called by creating objects");
    }
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        Main myObj = new Main(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
    }
}