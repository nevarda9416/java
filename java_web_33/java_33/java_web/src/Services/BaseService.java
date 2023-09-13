package Services;

import Models.Book;

import java.util.List;

public interface BaseService<T> {
    List<T> getAll();

    boolean save(T t);

    boolean update(T t);

    boolean delete(int id);
}
