package Services;

import java.sql.SQLException;

public interface BaseService<T> {
    void save();

    void update();

    int findByCode(String code);

    void deleteById();

    void getListsOrderByName() throws SQLException;
}
