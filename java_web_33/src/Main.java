
class Main extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        // Wait for the thread to finish
        // use isAlive() to prevent concurrency problems
        while (thread.isAlive()) {
            System.out.println("Waiting process...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
    }
}