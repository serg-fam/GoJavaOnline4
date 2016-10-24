package module07.homework.task02;

import module07.homework.task01.Order;

import java.util.Comparator;

/**
 * Created by Serg-fam on 22.10.2016 on 11:35.
 */
public class ComporatorByPriceAndCity implements Comparator<Order> {

    @Override
    public int compare(Order order1, Order order2) {
        int result = Integer.compare(order1.getPrice(), order2.getPrice());
        if (result != 0) {
            return result;
        }
        return order1.getUser().getCity().compareTo(order2.getUser().getCity());
    }
}
