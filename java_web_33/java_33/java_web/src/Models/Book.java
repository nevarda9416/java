package Models;

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


}
