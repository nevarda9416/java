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
        /**
         * for each loop
         * for (type variableName : arrayName) {
         *      // code block to be executed
         * }
         */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
        // Multidimensional Arrays
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        myNumbers[1][2] = 9; // Thay đổi giá trị hàng thứ 2 cột thứ 3 của mảng 2 chiều myNumbers
        System.out.println(myNumbers[1][2]);
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
        Person myPerson = new Person();
        myPerson.setName("John Wick 4"); // Set the value of the name variable to "John"
        System.out.println(myPerson.getName());
    }
}
