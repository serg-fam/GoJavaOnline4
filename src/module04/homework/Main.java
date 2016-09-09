package module04.homework;

/**
 * Created by Serg-fam on 07.09.2016 on 16:00.
 */
public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank();
        Bank euBank = new EUBank();
        Bank chinaBank = new ChinaBank();

        User userUs1 = new User();
        User userUs2 = new User();

        User userEu1 = new User();
        User userEu2 = new User();

        User useChina1 = new User();
        User useChina2 = new User();

        System.out.println(Currency.EUR);
        System.out.println(Currency.EUR.getNumber());
    }
}
