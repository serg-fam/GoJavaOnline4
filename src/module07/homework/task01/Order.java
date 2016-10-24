package module07.homework.task01;

import module01.homework.SecondClass;

/**
 * Created by Serg-fam on 07.10.2016 on 16:24.
 */
public class Order implements Comparable<Order> {

    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;


    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user +
                '}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (!itemName.equals(order.itemName)) return false;
        if (!shopIdentificator.equals(order.shopIdentificator)) return false;
        return user.equals(order.user);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + currency.hashCode();
        result = 31 * result + itemName.hashCode();
        result = 31 * result + shopIdentificator.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }

    @Override
    public int compareTo(Order order) {
/*
        int result = Long.compare(id, order.id);
        if (result != 0) {
            return result;
        }
        result = Integer.compare(price, order.price);
        if (result != 0) {
            return result;
        }
        result = currency.compareTo(order.currency);
        if (result != 0) {
            return result;
        }
        result = itemName.compareTo(order.itemName);
        if (result != 0) {
            return result;
        }
        result = shopIdentificator.compareTo(order.shopIdentificator);
        if (result != 0) {
            return result;
        }
        return user.compareTo(order.user);
*/
        return Long.compare(id, order.id);
    }
}
