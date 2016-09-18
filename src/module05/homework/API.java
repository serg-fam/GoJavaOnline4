package module05.homework;

import java.util.ArrayList;

/**
 * Created by Serg-fam on 13.09.2016 on 11:18.
 */
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);

}
