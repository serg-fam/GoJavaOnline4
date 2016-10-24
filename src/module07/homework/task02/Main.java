package module07.homework.task02;

import module07.homework.task01.*;
import module07.homework.task01.Currency;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;

/**
 * Created by Serg-fam on 07.10.2016 on 16:25.
 */
public class Main {
    public static void main(String[] args) {

        List<Order> orders = new LinkedList<>();

        orders.add(new Order(10L, 1200, module07.homework.task01.Currency.UAH, "ItemName1", "Identificator1", new User(10L, "FirstName1",
                "LastName1", "London", 100)));
        orders.add(new Order(11L, 2200, module07.homework.task01.Currency.USD, "ItemName2", "Identificator2", new User(20L, "FirstName2",
                "LastName2", "Wien", 200)));
        orders.add(new Order(12L, 2300, module07.homework.task01.Currency.UAH, "ItemName3", "Identificator3", new User(30L, "FirstName3",
                "LastName3", "NewYork", 300)));
        orders.add(new Order(13L, 1400, module07.homework.task01.Currency.USD, "ItemName4", "Identificator4", new User(40L, "FirstName4",
                "LastName4", "Kiev", 400)));
        orders.add(new Order(14L, 500, module07.homework.task01.Currency.USD, "ItemName5", "Identificator5", new User(50L, "FirstName5",
                "LastName5", "NewYork", 500)));
        orders.add(new Order(15L, 600, module07.homework.task01.Currency.USD, "ItemName6", "Identificator6", new User(60L, "FirstName6",
                "LastName6", "Kiev", 600)));
        orders.add(new Order(16L, 700, module07.homework.task01.Currency.UAH, "ItemName7", "Identificator7", new User(70L, "FirstName7",
                "LastName7", "Wien", 700)));
        orders.add(new Order(17L, 800, module07.homework.task01.Currency.USD, "ItemName8", "Identificator8", new User(80L, "FirstName8",
                "LastName8", "Tokio", 800)));
        orders.add(new Order(18L, 900, module07.homework.task01.Currency.UAH, "ItemName9", "Identificator9", new User(90L, "FirstName9",
                "LastName9", "Lviv", 900)));
        orders.add(new Order(19L, 1000, module07.homework.task01.Currency.USD, "ItemName10", "Identificator10", new User(11L, "FirstName10",
                "LastName09", "Kiev", 1000)));

        System.out.println(orders);

        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Integer.compare(o2.getPrice(), o1.getPrice());
            }
        });
        System.out.println("sort list by Order price in decrease orders : " + "\n" + orders);

        orders.sort(new ComporatorByPriceAndCity());
        System.out.println("sort list by Order price in increase orders AND User city :=================================" +
                "" + "\n" + orders);

        orders.sort(new Comparator<Order>() {
            @Override
            public int compare(Order order1, Order order2) {
                int result = order1.getItemName().compareTo(order2.getItemName());
                if (result != 0) {
                    return result;
                }
                result = order1.getShopIdentificator().compareTo(order2.getShopIdentificator());
                if (result != 0) {
                    return result;
                }
                return order1.getUser().getCity().compareTo(order2.getUser().getCity());
            }
        });
        System.out.println("sort list by Order itemName AND ShopIdentificator AND User city :==========================" +
                " " + "\n" + orders);

        orders.add(new Order(19L, 1000, module07.homework.task01.Currency.USD, "ItemName10", "Identificator10", new User(11L, "FirstName10",
                "LastName09", "Kiev", 1000)));

        System.out.println(orders.size());

        List<Order> uniqueOrders = new ArrayList<>();
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (!uniqueOrders.contains(order)) {
                uniqueOrders.add(order);
            }
        }
        orders.clear();
        orders.addAll(uniqueOrders);

        System.out.println("List elements without duplicates :======================================================" +
                " " + "\n" + orders);

        iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getPrice() > 1500) {
                iterator.remove();
            }
        }
        System.out.println("delete items where price less than 1500 :===============================================" +
                "\n" + orders);

        List<Order> uah = new ArrayList<>();
        List<Order> usd = new ArrayList<>();
//orders.stream().collect(Collector.of())
        iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getCurrency() == Currency.USD) {
                usd.add(order);
            } else if (order.getCurrency() == Currency.UAH) {
                uah.add(order);

            }
        }
        System.out.println(uah + "\n\n" + usd);

        Map<String, List<Order>> map = new HashMap<>();

        for (Order order : orders) {
            String city = order.getUser().getCity();
            if (map.containsKey(city)) {
                map.get(city).add(order);
            } else {
                List<Order> newList = new ArrayList<>();
                newList.add(order);
                map.put(city, newList);
            }
        }
        for (String city : map.keySet()) {
            System.out.println(city + "\n" + map.get(city) + "===");
        }
    }
}
