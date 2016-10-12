package module07.homework;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * Created by Serg-fam on 07.10.2016 on 16:25.
 */
public class Main {
    public static void main(String[] args) {


        List<Order> order = new LinkedList<>();

        order.add(new Order(10L, 1200, Currency.UAH, "ItemName1", "Identificator1", new User(10L, "FirstName1",
                "LastName1", "City1 Kiev", 100)));
        order.add(new Order(11L, 2200, Currency.USD, "ItemName2", "Identificator2", new User(20L, "FirstName2",
                "LastName2", "City2 Kiev", 200)));
        order.add(new Order(12L, 2300, Currency.UAH, "ItemName3", "Identificator3", new User(30L, "FirstName3",
                "LastName3", "City3", 300)));
        order.add(new Order(13L, 1400, Currency.USD, "ItemName4", "Identificator4", new User(40L, "FirstName4",
                "LastName4", "City Kiev", 400)));
        order.add(new Order(14L, 500, Currency.USD, "ItemName5", "Identificator5", new User(50L, "FirstName5",
                "LastName5", "City5", 500)));
        order.add(new Order(15L, 600, Currency.USD, "ItemName6", "Identificator6", new User(60L, "FirstName6",
                "LastName6", "City Kiev", 600)));
        order.add(new Order(16L, 700, Currency.UAH, "ItemName7", "Identificator7", new User(70L, "FirstName7",
                "LastName7", "City7", 700)));
        order.add(new Order(17L, 800, Currency.USD, "ItemName8", "Identificator8", new User(80L, "FirstName8",
                "LastName8", "City8", 800)));
        order.add(new Order(18L, 900, Currency.UAH, "ItemName9", "Identificator9", new User(90L, "FirstName9",
                "LastName9", "City9", 900)));
        order.add(new Order(19L, 1000, Currency.USD, "ItemName10", "Identificator10", new User(11L, "FirstName10",
                "LastName10", "City Kiev", 1000)));

        System.out.println(order);

        order.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        System.out.println("sort list by Order price in decrease order : " + "\n" + order);

        order.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {

                if (o1.getPrice() == o2.getPrice()) //return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                    //o2.getUser().getCity().length() - o1.getUser().getCity().length();
                    return o1.getPrice() - o2.getPrice();
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        });
        System.out.println("sort list by Order price in increase order AND User city :=================================" +
                "" + "\n" + order);

        order.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getItemName().length() < o2.getItemName().length()) {
                    return o2.getItemName().length() - o1.getItemName().length();
                }
                if (o1.getShopIdentificator().length() < o2.getShopIdentificator().length()) {
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                }
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
        });
        System.out.println("sort list by Order itemName AND ShopIdentificator AND User city :==========================" +
                " " + "\n" + order);
        order.add(new Order(19L, 1000, Currency.USD, "ItemName10", "Identificator10", new User(11L, "FirstName10",
                "LastName10", "City Kiev", 1000)));
        Set<Order> orderHasSet = new HashSet<>();
        orderHasSet.addAll(order);
        List<Order> list = new LinkedList<>();
        list.addAll(orderHasSet);
        TreeSet<Order> orderTreeSet = new TreeSet<>();
        list.addAll(orderTreeSet);
        order.clear();
        order.addAll(list);
        System.out.println("List elements without duplicates :======================================================" +
                " " + "\n" + order);
        order.removeIf(x -> (x.getPrice() < 1500));
        System.out.println("delete items where price less than 1500 :===============================================" +
                "\n" + order);
        order.clear();
        order.addAll(list);

        order.replaceAll(new UnaryOperator<Order>() {
            @Override
            public Order apply(Order order) {
                if (order.getCurrency() == Currency.USD) return order;
                return null;
            }
        });
        System.out.println("separate list orders in USD" + "\n" + order);
        order.clear();
        order.addAll(orderHasSet);
        order.replaceAll(new UnaryOperator<Order>() {
            @Override
            public Order apply(Order order) {
                if (order.getCurrency() == Currency.UAH) return order;
                return null;
            }
        });
        System.out.println("separate list orders in UAH" + "\n" + order);
        Map<String, Order> map = new HashMap<>();
        for (Order item : orderHasSet) {
            map.put(item.getUser().getCity(), item);
        }
        System.out.println("separate list for as many lists as many unique cities are in User : "
                + map.size() + " " + orderHasSet.size() + "\n" + map);
    }
}
