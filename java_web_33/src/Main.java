import java.util.HashSet; // import the HashSet class

/**
 * How the LinkedList works?
 * The LinkedList stores its items in "containers". The list has a link to the first container and each container has a
 * link to the next container in the list. To add an element to the list, the element is placed into a new container and
 * that container is linked to one of the other containers in the list
 */
class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.clear();
        cars.add("Ford");
        // Even though BMW is added twice below, it only appears once in the set because every item in a set has to be unique
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars.contains("Mazda"));
        cars.remove("Mazda");
        System.out.println(cars.size());
        System.out.println(cars);
        // Loop Through a HashSet
        for (String i : cars) {
            System.out.println(i);
        }
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();
        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}