package module08.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serg-fam on 16.10.2016 on 13:29.
 */
public interface AbstractDAO<T> {

    T save(T t);
    void delete(T t);
    void deleteAll(List T);
    void saveAll(List T);
    List T getList();
}
