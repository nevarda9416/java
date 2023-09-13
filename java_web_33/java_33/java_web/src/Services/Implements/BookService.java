package Services.Implements;

import Services.BaseService;

import Models.Book;

import java.util.List;

public class BookService implements BaseService<Book> {
    // CRUD tương tự như CustomerService
    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public boolean save(Book book) {
        return false;
    }

    @Override
    public boolean update(Book book) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

}
