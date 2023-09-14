package Services.Implements;

import Services.BaseService;

import Models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService implements BaseService<Book> {
    // CRUD tương tự như CustomerService
    List<Book> bookList = new ArrayList<>();

    @Override
    public List<Book> getAll() {
        return this.bookList;
    }

    @Override
    public boolean save(Book book) {
        bookList.add(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        if (!this.bookList.isEmpty()) {
            for (int i = 0; i < this.bookList.size(); i++) {
                if (book.getId() == bookList.get(i).getId()) {
                    bookList.get(i).setName(book.getName());
                    bookList.get(i).setTypeBook(book.getTypeBook());
                    bookList.get(i).setAmount(book.getAmount());
                }
            }
        }
        return true;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < this.bookList.size(); i++) {
            if (id == bookList.get(i).getId()) {
                bookList.remove(i);
            }
        }
        return true;
    }
}
