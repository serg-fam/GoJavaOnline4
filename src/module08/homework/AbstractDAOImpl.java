package module08.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Serg-fam on 16.10.2016 on 13:38.
 */
public class AbstractDAOImpl<T> implements AbstractDAO<T> {

    private List<T> db = new ArrayList<>();

    @Override
    public T save(T t) {
        db.add(t);
        return t;
    }

    @Override
    public T delete(T t) {
        db.remove(t);
        return t;
    }

    @Override
    public void deleteAll(List<T> t) {
        Iterator<T> iterator = t.iterator();
        while (iterator.hasNext()) {
            T db = iterator.next();
            delete(db);
        }
    }

    @Override
    public void saveAll(List<T> t) {
        Iterator<T> iterator = t.iterator();
        while (iterator.hasNext()) {
            T db = iterator.next();
            save(db);
        }
    }

    @Override
    public void getList(List<T> t) {
        for (int i = 0; i < t.size(); i++) {
            t.get(i);
        }
    }

    @Override
    public void get(long id) {

    }

    @Override
    public void deleteById(long id) {

    }


}
