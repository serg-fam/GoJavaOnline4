package module05.homework;
/**
 * Created by Serg-fam on 13.09.2016 on 11:28.
 */
public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    Room[] getAll();
}

