package module05.homework;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/**
 * Created by Serg-fam on 13.09.2016 on 11:22.
 */
public class TripAdvisorAPI implements API {

    Room[] rooms;

    public TripAdvisorAPI() {
        Room room1 = new Room(100, 100, 1, new Date(20 / 9 / 2016), "Kiev", "TripInn1");
        Room room2 = new Room(101, 200, 2, new Date(21 / 9 / 2016), "Kiev", "TripInn2");
        Room room3 = new Room(102, 300, 3, new Date(12 / 10 / 2016), "Kiev", "TripInn3");
        Room room4 = new Room(103, 400, 4, new Date(13 / 10 / 2016), "Kiev", "TripInn4");
        Room room5 = new Room(104, 500, 5, new Date(14 / 10 / 2016), "Kiev", "All");

        this.rooms = new Room[]{room1, room2, room3, room4, room5};
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new ArrayList<Room>();
        Room fiendRoom = new Room(100L, price, persons, Calendar.getInstance().getTime(), city, hotel);
        for (Room room : rooms) {
            if (room.equals(fiendRoom)) {
                result.add(room);
            }

        }
        return result.toArray(new Room[result.size()]);
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }

}
