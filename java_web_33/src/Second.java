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
        /**
         * Java Type Casting: 2 types
         * Widening Casting (automatically) - converting a smaller type to a larger type size:
         * byte -> short -> char -> int -> long -> float -> double
         * Narrowing Casting (manually) - converting a larger type to a smaller size type:
         * double -> float -> long -> int -> char -> short -> byte
         */
        // Widening Casting (automatically)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);
        System.out.println(myDouble);
        // Narrowing Casting (manually)
        double myDouble2 = 9.78f;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myInt2);
        System.out.println(myDouble2);
    }
}
