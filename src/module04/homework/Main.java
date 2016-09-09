package module04.homework;

/**
 * Created by Serg-fam on 07.09.2016 on 16:00.
 */
public class Main {
    public static void main(String[] args) {

        Bank usBank = new USBank();
        usBank.setCurrency(Currency.USD);
        usBank.setCurrency(Currency.EUR);
        Bank euBank = new EUBank();
        euBank.setCurrency(Currency.USD);
        euBank.setCurrency(Currency.EUR);
        Bank chinaBank = new ChinaBank();
        chinaBank.setCurrency(Currency.USD);
        chinaBank.setCurrency(Currency.EUR);


        User userUs1 = new User();
        userUs1.setBalance(5000);
        userUs1.setBank(usBank);


        BankSystem bankSystem = new BankSystemImpl();
       // BankSystem.withdrawOfUser(userUs1,1100);

        System.out.println(userUs1.toString());
        User userUs2 = new User();

        User userEu1 = new User();
        User userEu2 = new User();

        User useChina1 = new User();
        User useChina2 = new User();

        System.out.println(Currency.EUR);
        System.out.println(Currency.EUR.getNumber());
    }
}
