package module07.homework;

import java.util.Comparator;

/**
 * Created by Sergi on 10/8/2016.
 */
public class PriceComporator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o2.getPrice() - o1.getPrice();
    }


 }
