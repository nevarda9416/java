public class Second {
    String fname = "John";
    String lname = "Doe";
    int age = 24;
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
        Second second = new Second();
        System.out.println("Name: " + second.fname + " " + second.lname);
        System.out.println("Age: " + second.age);
    }
}
