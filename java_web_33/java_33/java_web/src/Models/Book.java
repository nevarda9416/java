package Models;

import java.util.Scanner;

public class Book extends Common{
    private String typeBook;
    private int amount;

    public Book() {

    }
    public Book(int id, String name, String typeBook, int amount) {
        super(id, name);
        this.typeBook = typeBook;
        this.amount = amount;
    }

    public String getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(String typeBook) {
        this.typeBook = typeBook;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void displayInfo() {
        System.out.println("Mã sách: " + this.getId());
        System.out.println("Tên sách: " + this.getName());
        System.out.println("Loại sách: " + this.getTypeBook());
        System.out.println("Số lượng: " + this.getAmount());
    }

    public Book inputData() {
        Book book = new Book();
        System.out.print("Mã sách: ");
        Scanner scannerId = new Scanner(System.in);
        book.setId(scannerId.nextInt());
        System.out.print("Tên sách: ");
        Scanner scannerName = new Scanner(System.in);
        book.setName(scannerName.nextLine());
        System.out.print("Loại sách: ");
        Scanner scannerTypeBook = new Scanner(System.in);
        book.setTypeBook(scannerTypeBook.nextLine());
        System.out.print("Số lượng: ");
        Scanner scannerAmount = new Scanner(System.in);
        book.setAmount(scannerAmount.nextInt());
        return book;
    }
}
