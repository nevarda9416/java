package Services;

import java.sql.SQLException;

public interface BaseService<T> {
    void save();

    void update();

    void findByName();

    void deleteById();

    void getListsOrderByName() throws SQLException;
}
