package module7.homework;


import java.util.LinkedList;
import java.util.List;

/**
 * Created by Serg-fam on 07.10.2016 on 16:25.
 */
public class Main {
    public static void main(String[] args) {

        List<Order> order = new LinkedList<>();

        order.add(new Order(10L, 100, Currency.UAH, "ItemName1", "Identificator1", new User(10L, "FirstName1", "LastName1", "City1", 100)));
        order.add(new Order(11L, 200, Currency.USD, "ItemName2", "Identificator2", new User(20L, "FirstName2", "LastName3", "City2", 300)));
        order.add(new Order(12L, 300, Currency.UAH, "ItemName3", "Identificator3", new User(30L, "FirstName3", "LastName4", "City3", 400)));
        order.add(new Order(13L, 400, Currency.USD, "ItemName4", "Identificator4", new User(40L, "FirstName4", "LastName5", "City4", 600)));
        order.add(new Order(15L, 600, Currency.USD, "ItemName6", "Identificator6", new User(60L, "FirstName6", "LastName7", "City5", 700)));
        order.add(new Order(16L, 700, Currency.UAH, "ItemName7", "Identificator7", new User(70L, "FirstName7", "LastName8", "City6", 800)));
        order.add(new Order(17L, 800, Currency.USD, "ItemName8", "Identificator8", new User(80L, "FirstName8", "LastName9", "City7", 900)));
        order.add(new Order(18L, 900, Currency.UAH, "ItemName9", "Identificator9", new User(9L, "FirstName9", "LastName11", "City11", 1100)));
        order.add(new Order(19L, 1000, Currency.USD, "ItemName10", "Identificator10", new User(11L, "FirstName10", "LastName10", "City11", 1100)));
        System.out.println(order);

    }
}
