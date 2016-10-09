package module07.homework;


import order.*;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Serg-fam on 07.10.2016 on 16:25.
 */
public class Main {
    public static void main(String[] args) {

        List<Order> order = new LinkedList<>();

        order.add(new Order(10L, 1200, Currency.UAH, "ItemName1", "Identificator1", new User(10L, "FirstName1", "LastName1", "City1", 100)));
        order.add(new Order(11L, 2200, Currency.USD, "ItemName2", "Identificator2", new User(20L, "FirstName2", "LastName2", "City2", 200)));
        order.add(new Order(12L, 2300, Currency.UAH, "ItemName3", "Identificator3", new User(30L, "FirstName3", "LastName3", "City3", 300)));
        order.add(new Order(13L, 1400, Currency.USD, "ItemName4", "Identificator4", new User(40L, "FirstName4", "LastName4", "City4", 400)));
        order.add(new Order(14L, 500, Currency.USD, "ItemName5", "Identificator5", new User(50L, "FirstName5", "LastName5", "City5", 500)));
        order.add(new Order(15L, 600, Currency.USD, "ItemName6", "Identificator6", new User(60L, "FirstName6", "LastName6", "City6", 600)));
        order.add(new Order(16L, 700, Currency.UAH, "ItemName7", "Identificator7", new User(70L, "FirstName7", "LastName7", "City7", 700)));
        order.add(new Order(17L, 800, Currency.USD, "ItemName8", "Identificator8", new User(80L, "FirstName8", "LastName8", "City8", 800)));
        order.add(new Order(18L, 900, Currency.UAH, "ItemName9", "Identificator9", new User(90L, "FirstName9", "LastName9", "City9", 900)));
        order.add(new Order(19L, 1000, Currency.USD, "ItemName10", "Identificator10", new User(11L, "FirstName10", "LastName10", "City10", 1000)));
        System.out.println(order);
        order.sort(new PriceComporator());
        System.out.println(order);
        order.sort(new CityPriceComporator());
        System.out.println(order);



    }
}
