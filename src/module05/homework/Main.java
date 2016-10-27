package module05.homework;
import java.util.Arrays;
/**
 * Created by Serg-fam on 13.09.2016 on 11:31.
 */
public class Main {
    public static void main(String[] args) {

        API bookingComAPI = new BookingComAPI();
        API tripAdvisorAPI = new TripAdvisorAPI();
        API googleAPI = new GoogleAPI();
        API[] apis = new API[]{bookingComAPI};
        Controller controller = new Controller(apis);
        Room[] rooms;
        rooms = controller.check(bookingComAPI, googleAPI);
        System.out.println("=============================checkRooms bookingComAPI & googleAPI========================" +
                "===================" + "\n");
        System.out.println("bookingComAPI & googleAPI: " + Arrays.toString(rooms) + "\n");
        rooms = controller.check(bookingComAPI, tripAdvisorAPI);
        System.out.println("=============================checkRooms bookingComAPI & tripAdvisorAPI====================" +
                "=======================" + "\n");
        System.out.println("bookingComAPI & tripAdvisorAPI: " + Arrays.toString(rooms) + "\n");
        rooms = controller.check(googleAPI, tripAdvisorAPI);
        System.out.println("=============================checkRooms googleAPI & tripAdvisorAPI========================" +
                "===================" + "\n");
        System.out.println("googleAPI & tripAdvisorAPI: " + Arrays.toString(rooms) + "\n");
        System.out.println("=============================findRooms===========================================" + "\n");
        rooms = bookingComAPI.findRooms(100, 1, "Kiev", "BookingInn1");
        System.out.println(Arrays.toString(rooms));
        rooms = googleAPI.findRooms(200, 2, "Kiev", "GoogleInn2");
        System.out.println(Arrays.toString(rooms));
        rooms = tripAdvisorAPI.findRooms(300, 3, "Kiev", "TripInn3");
        System.out.println(Arrays.toString(rooms));
        System.out.println("============================requestRooms bookingComAPI==================================" +
                "==========" + "\n");
        rooms = controller.requestRooms(100, 1, "Kiev", "BookingInn1");
        System.out.println(Arrays.toString(rooms));
        System.out.println("============================requestRooms googleAPI=======================================" +
                "=====" + "\n");
        rooms = controller.requestRooms(200, 2, "Kiev", "GoogleInn");
        System.out.println(Arrays.toString(rooms));
        System.out.println("============================requestRooms tripAdvisorAPI===================================" +
                "=========" + "\n");
        rooms = controller.requestRooms(300, 3, "Kiev", "TripInn3");
        System.out.println(Arrays.toString(rooms));
    }
}
