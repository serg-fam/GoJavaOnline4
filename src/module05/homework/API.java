package module05.homework;
/**
 * Created by Serg-fam on 13.09.2016 on 11:18.
 */
public interface API {

    Room[] getAll();

    Room[] findRooms(int price, int persons, String city, String hotel);

}
