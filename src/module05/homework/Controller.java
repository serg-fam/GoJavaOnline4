package module05.homework;
import java.util.Arrays;
import java.util.Calendar;
/**
 * Created by Serg-fam on 14.09.2016 on 15:19.
 */
public class Controller {

    private API[] apis;

    public Controller(API[] apis) {

        this.apis = new API[]{new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};
    }
    Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room reqRoom = new Room(100L, price, persons, Calendar.getInstance().getTime(), city, hotel);
        Room[] result = new Room[0];
        Room[] apiRooms;
        for (API api : apis) {
            apiRooms = api.getAll();
            for (Room room : apiRooms) {
                if (room.equals(reqRoom) && hotel.equals(room.getHotelName())) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = room;
                }
            }
        }// да
        return result;
    }

    Room[] check(API api1, API api2) {
        Room[] result = new Room[0];
        Room[] api1All = api1.getAll();
        Room[] api2All = api2.getAll();
        for (Room api1Room : api1All) {
            for (Room api2Room : api2All) {
                if (api1Room.equals(api2Room)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = api1Room;
                }
            }
        }
        return result;
    }
}
