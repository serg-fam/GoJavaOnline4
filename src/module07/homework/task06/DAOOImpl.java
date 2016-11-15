package module07.homework.task06;
import java.util.Date;

/**
 * Created by Serg-fam on 14.09.2016 on 15:22.
 */
public class DAOOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("SAVE ");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(" DELETE");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("UPDATE");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(104, 500, 5, new Date(14 / 10 / 2016), "Kiev", "All");
        System.out.println("findById");
        return room;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
