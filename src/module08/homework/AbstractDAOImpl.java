package module08.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serg-fam on 16.10.2016 on 13:38.
 */
public class AbstractDAOImpl<T> implements AbstractDAO<T> {

    private List<T> db = new ArrayList<T>();

    @Override
    public T save(T t) {
        db.add(t);
        return t;

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteAll(List T) {

    }

    @Override
    public void saveAll(List T) {

    }

    @Override
    public List<T> getList() {
        return null;
    }

    @Override
    public void get(long id) {

    }

    @Override
    public void deleteById(long id) {

    }


}
