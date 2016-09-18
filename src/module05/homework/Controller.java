package module05.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Serg-fam on 14.09.2016 on 15:19.
 */
public class Controller {

    private API[] apis;

    public Controller(API[] apis) {

        this.apis = new API[]{new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {

        List<API> result = new ArrayList<>();

        Room reqRoom = new Room(100L, price, persons, Calendar.getInstance().getTime(), city, hotel);

        for (API api : apis) {
          //  if (api.equals(reqRoom)) {
           //     result.add(api);
           // }
            System.out.println(api);
        }
        return (Room[]) result.toArray(new Room[result.size()]);
    }


    Room save(Room room) {
        DAOHardImpl daoHard = new DAOHardImpl();
        return daoHard.save(room);
    }


    Room[] check(API api1, API api2) {

     //   Room[] res1 = api1.findRooms();
      //  Room[] res2 = api2.findRooms(price, persons, city, hotel);

        //api1.getAll();
        //api2.getAll();


        //logic (!!!) KEY moment

        return null;

    }

}
