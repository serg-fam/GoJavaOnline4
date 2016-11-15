package module07.homework.task06;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Serg-fam on 13.09.2016 on 11:18.
 */
public class BookingComAPI implements API {

    private List<Room> rooms;

    BookingComAPI() {
        rooms = new ArrayList<>();
        rooms.add(new Room(100, 100, 1, new Date(10 / 9 / 2016), "Kiev", "BookingInn1"));
        rooms.add(new Room(101, 100, 1, new Date(10 / 10 / 2016), "Kiev", "BookingInn1"));
        rooms.add(new Room(102, 100, 1, new Date(12 / 10 / 2016), "Kiev", "BookingInn1"));
        rooms.add(new Room(103, 400, 4, new Date(13 / 10 / 2016), "Kiev", "BookingInn4"));
        rooms.add(new Room(104, 500, 5, new Date(14 / 10 / 2016), "Kiev", "All"));
    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new ArrayList<>();
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
