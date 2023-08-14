public class Main {
    int x = 15;
    int y = 3;
    
    public static boolean stupid = false;
    public static void main(String[] args) {
        System.out.println("Hello world! Stupid is " + stupid);
        Main myObj1 = new Main(); // Object 1
        myObj1.x = 5353;
        Main myObj2 = new Main(); // Object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}