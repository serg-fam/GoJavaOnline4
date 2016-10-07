package module7.homework;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static module7.homework.Currency.*;

/**
 * Created by Serg-fam on 07.10.2016 on 16:25.
 */
public class Main {
    public static void main(String[] args) {

        List<Order> order = new ArrayList<>();

           order.add(10L, 100, USD, "ItemName1", "Identificator1", new  User(10L, "FirstName1", "LastName1", "City1", 100));

   /*   order.add(new User(30L, "FirstName3", "LastName3", "City3", 300));
        order.add(new User(40L, "FirstName4", "LastName4", "City4", 400));
        order.add(new User(50L, "FirstName5", "LastName5", "City5", 500));
        order.add(new User(60L, "FirstName6", "LastName6", "City6", 600));
        order.add(new User(70L, "FirstName7", "LastName7", "City7", 700));
        order.add(new User(80L, "FirstName8", "LastName8", "City8", 800));
        order.add(new User(90L, "FirstName9", "LastName9", "City9", 900));
        order.add(new User(11L, "FirstName11", "LastName11", "City11", 1100));*/

        System.out.println(order);

    }
}
