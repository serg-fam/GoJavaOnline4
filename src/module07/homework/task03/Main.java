package module07.homework.task03;

import module07.homework.task01.Currency;
import module07.homework.task01.Order;
import module07.homework.task01.User;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Serg-fam on 22.10.2016 on 12:06.
 */
public class Main {
    public static void main(String[] args) {

        Set<Order> orders = new TreeSet<>();

        orders.add(new Order(10L, 1200, Currency.UAH, "ItemName1", "Identificator1", new User(10L, "FirstName1",
                "LastName1", "City1 Kiev", 100)));
        orders.add(new Order(11L, 2200, Currency.USD, "ItemName2", "Identificator2", new User(20L, "FirstName2",
                "LastName2", "City2 Kiev", 200)));
        orders.add(new Order(12L, 2300, Currency.UAH, "ItemName3", "Identificator3", new User(30L, "FirstName3",
                "LastName3", "City3", 300)));
        orders.add(new Order(13L, 1400, Currency.USD, "ItemName4", "Identificator4", new User(40L, "FirstName4",
                "LastName4", "City Kiev", 400)));
        orders.add(new Order(14L, 500, Currency.USD, "ItemName5", "Identificator5", new User(50L, "FirstName5",
                "LastName5", "City5", 500)));
        orders.add(new Order(15L, 600, Currency.USD, "ItemName6", "Identificator6", new User(60L, "FirstName6",
                "LastName6", "City Kiev", 600)));
        orders.add(new Order(16L, 700, Currency.UAH, "ItemName7", "Identificator7", new User(70L, "FirstName7",
                "LastName7", "City7", 700)));
        orders.add(new Order(17L, 800, Currency.USD, "ItemName8", "Identificator8", new User(80L, "FirstName8",
                "LastName8", "City8", 800)));
        orders.add(new Order(17L, 900, Currency.UAH, "ItemName9", "Identificator9", new User(90L, "FirstName9",
                "LastName9", "City9", 900)));
        orders.add(new Order(18L, 1000, Currency.USD, "ItemName10", "Identificator10", new User(11L, "FirstName10",
                "Petrov", "City Kiev", 1000)));
        System.out.println(orders.size());

        Iterator<Order> iteratorLastName = orders.iterator();

        while (iteratorLastName.hasNext()) {
            Order item = iteratorLastName.next();
            if (item.getUser().getLastName().contains("Petrov")) {
                System.out.println("Check if set contain Order where User’s Petrov is TRUE" + "\n" + item);
            }
        }

        System.out.println(orders.size());

        Order result = null;

        Iterator<Order> iteratorLargesPrice = orders.iterator();

        while (iteratorLargesPrice.hasNext()) {
            Order order = iteratorLargesPrice.next();
            if (result == null || result.getPrice() < order.getPrice()) {
                result = order;
            }
        }
        System.out.println("Print Order with largest price using only one " +
                "set method : " + "\n" + result);

        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getCurrency() == Currency.USD)
                iterator.remove();
        }
        System.out.println("Delete orders where currency is USD using Iterator: " + "\n" + orders);


    }
}
