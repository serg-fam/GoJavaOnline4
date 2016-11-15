package module07.homework.task06;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;


/**
 * Created by Serg-fam on 14.09.2016 on 15:19.
 */
public class Controller {

    public List<API> apis;

    public Controller(List<API> apis) {

        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
        System.out.println("APIS = " + apis.size());


    }

    List<Room> requestRooms(int price, int persons, String city, String hotel) {
        Room reqRoom = new Room(100L, price, persons, Calendar.getInstance().getTime(), city, hotel);
//     //   System.out.println(apis.size());
        //  Controller controller = new Controller(apis);

        System.out.println("APIS = " + apis.size());
        List<Room> result = new ArrayList<>();
/*
        List<Room> apiRooms;// = new ArrayList<>();
        Iterator<API> iterator = apis.iterator();
        while (iterator.hasNext()) {
            API api = iterator.next();
            apiRooms = api.getAll();
            System.out.println("apiRooms = " + apiRooms);
        }
*/
        //  System.out.println("APIS = " + apis.size());
        //  System.out.println("apiRooms = " + apiRooms);
        // List<Room> apiRooms = new ArrayList<>();


        //   Iterator<API> iterator = apis.iterator();
        //    while (iterator.hasNext()){
        //      API api = iterator.next();
        // apiRooms=api.getAll();
        // }
        //  for (API api:apis) {
        // apiRooms = api.getAll();
//        System.out.println(apis.size());
        //    System.out.println(apiRooms.size());

        //  }
        //  apiRooms = api.getAll();
        /*for (API api : apis) {
         apiRooms = api.getAll();
           //  apiRooms.add(api);
            System.out.println(apiRooms.size());
            for (Room room : apiRooms) {
                if (room.equals(reqRoom) && hotel.equals(room.getHotelName())) {
                    result.add(room);
                }
            }
        }*/
        return result;
    }

    List<Room> check(API api1, API api2) {
        List<Room> result = new ArrayList<>();
        List<Room> api1All = api1.getAll();
        System.out.println(api1All.size());
        List<Room> api2All = api2.getAll();
        System.out.println(api2All.size());
        for (Room api1Room : api1All) {
            for (Room api2Room : api2All) {
                if (api1Room.equals(api2Room)) {
                    result.add(api2Room);
                }
            }
        }
        return result;
    }
}
