package module07.homework.task06;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Serg-fam on 13.09.2016 on 11:23.
 */
public class GoogleAPI implements API {

    List<Room> rooms;

    public GoogleAPI() {
        rooms = new ArrayList<Room>();
        rooms.add(new Room(100, 200, 2, new Date(10 / 10 / 2016), "Kiev", "GoogleInn"));
        rooms.add(new Room(101, 200, 2, new Date(11 / 10 / 2016), "Kiev", "GoogleInn"));
        rooms.add(new Room(102, 200, 3, new Date(12 / 10 / 2016), "Kiev", "GoogleInn"));
        rooms.add(new Room(103, 400, 4, new Date(13 / 10 / 2016), "Kiev", "GoogleInn2"));
        rooms.add(new Room(104, 500, 5, new Date(14 / 10 / 2016), "Kiev", "All"));
    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new ArrayList<Room>();
        Room fiendRoom = new Room(100L, price, persons, Calendar.getInstance().getTime(), city, hotel);
        for (Room room : rooms) {
            if (room.equals(fiendRoom)) {
                result.add(room);
            }
        }
        return result;
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }

}
