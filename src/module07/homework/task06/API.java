package module07.homework.task06;

import java.util.List;

/**
 * Created by Serg-fam on 13.09.2016 on 11:18.
 */
public interface API {

   List<Room> findRooms(int price, int persons, String city, String hotel);

   List <Room> getAll();
}
