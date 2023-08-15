public class Second {
    int modelYear;
    String modelName;

    public Second(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Student myObj = new Student(); // Create a myCar object
        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study();
    }
}
