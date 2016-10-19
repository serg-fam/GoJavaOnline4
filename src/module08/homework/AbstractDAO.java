package module08.homework;

import java.util.List;

/**
 * Created by Serg-fam on 16.10.2016 on 13:29.
 */
public  interface AbstractDAO<T> {

    T save(T t);

   T delete(T t);

    void deleteAll(List<T> t);

     void saveAll(List<T> t);

     void getList(List<T> t);

     void get(long id);

    void deleteById(long id);



}
