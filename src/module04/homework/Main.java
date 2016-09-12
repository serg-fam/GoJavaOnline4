package module04.homework;

/**
 * Created by Serg-fam on 07.09.2016 on 16:00.
 */
public class Main {
    public static void main(String[] args) {

        Bank usBank = new USBank(5000L, "USA", Currency.USD, 1200, 5000.0, 98L, 25000L);
        Bank euBank = new EUBank(4000L, "EU", Currency.EUR, 1000, 4000.0, 74L, 35000L);
        Bank chinaBank = new ChinaBank(3000L, "CHINA", Currency.USD, 2000, 2000.0, 68L, 15000L);

        User userUs1 = new User(3467L, "userUs1", 1500.0, 10, "USCompany1", 1000, usBank);
        userUs1.setBalance(5000);
        userUs1.setBank(usBank);
        User userUs2 = new User(3468L, "userUs2", 1200.0, 12, "USCompany2", 1500, usBank);
        userUs2.setBalance(4000);
        userUs2.setBank(usBank);
        User userEu1 = new User(3567L, "userEu1", 1000.0, 24, "EUCompany1", 800, euBank);
        userEu1.setBalance(7000);
        userEu1.setBank(euBank);
        User userEu2 = new User(3587L, "userEu2", 1000.0, 36, "EUCompany2", 900, euBank);
        userEu2.setBalance(3000);
        userEu2.setBank(euBank);
        User useChina1 = new User(4567L, "useChina1", 1000.0, 48, "ChinaCompany1", 500, chinaBank);
        useChina1.setBalance(5000);
        useChina1.setBank(chinaBank);
        User useChina2 = new User(4587L, "useChina2", 1100.0, 24, "ChinaCompany2", 400, chinaBank);
        useChina2.setBank(chinaBank);
        useChina2.setBalance(8000);
        BankSystem bankSystem = new BankSystemImpl();
        bankSystem.withdrawOfUser(userUs1, 1100);
        bankSystem.fundUser(userUs1, 2000);
        bankSystem.transferMoney(userUs1, userUs2, 1000);
        bankSystem.paySalary(userUs1);
        System.out.println(userUs1.toString());
        bankSystem.withdrawOfUser(userUs2, 1200);
        bankSystem.fundUser(userUs2, 3000);
        bankSystem.transferMoney(userUs2, userUs1, 500);
        bankSystem.paySalary(userUs2);
        System.out.println(userUs2.toString());
        bankSystem.withdrawOfUser(userEu1, 1500);
        bankSystem.fundUser(userEu1, 2500);
        bankSystem.transferMoney(userEu1, userEu2, 500);
        bankSystem.paySalary(userEu1);
        System.out.println(userEu1.toString());
        bankSystem.withdrawOfUser(userEu2, 1700);
        bankSystem.fundUser(userEu2, 2700);
        bankSystem.transferMoney(userEu2, userEu1, 700);
        bankSystem.paySalary(userEu2);
        System.out.println(userEu2.toString());
        bankSystem.withdrawOfUser(useChina1, 1500);
        bankSystem.fundUser(useChina1, 2500);
        bankSystem.transferMoney(useChina1, useChina2, 500);
        bankSystem.paySalary(useChina1);
        System.out.println(useChina1.toString());
        bankSystem.withdrawOfUser(useChina2, 1750);
        bankSystem.fundUser(useChina2, 2750);
        bankSystem.transferMoney(useChina2, useChina1, 750);
        bankSystem.paySalary(useChina2);
        System.out.println(useChina2.toString());
    }
}
