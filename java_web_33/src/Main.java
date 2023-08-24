// Java program to show working of user defined
// Generic functions
class Main extends Thread {
    // A generic method example
    static <T extends Comparable<T>> void sortGenerics(T[] a) {
        // As we are comparing the non-primitive data types
        // We need to use Comparable class
        // Bubble sort logic
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j].compareTo(a[j+1]) > 0) {
                    swap(j, j + 1, a);
                }
            }
        }
        // Printing the elements after sorted
        for (T i : a)
        {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static <T> void swap(int i, int j, T[] a)
    {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Integer[] a = {100, 22, 58, 41, 6, 50};
        Character[] c = {'v', 'g', 'a', 'c', 'x', 'd', 't'};
        String[] s = {"Virat", "Rohit", "Abhinay", "Chandu", "Sam", "Bharat", "Kalam"};
        System.out.println("Sorted Integer array: ");
        sortGenerics(a);
        System.out.println("Sorted Character array: ");
        sortGenerics(c);
        System.out.println("Sorted String array: ");
        sortGenerics(s);
    }
}