package Module3.Homework.Task4;

/**
 * Created by Serg-fam on 02.09.2016 on 11:05.
 */
public class Main {

    public static void main(String[] args) {

        User user = new User("Serg", 1000, 12, "Company", 200, "USD");
        User user2 = new User("Oleg", 2000, 24, "Company2", 500, "EUR");

        user.paySalary();


        System.out.println(user);

        System.out.println("Balance + Salary = " + user.getBalance());

        System.out.println("Balance - Summ = " + user.withdraw(900));

        System.out.println("companyNameLength = " + user.companyNameLength());

        System.out.println("MonthsOfEmployment + addMonth = " + user.monthIncreaser(12));

        System.out.println(user.toString()+"\n");

        System.out.println("---------------------------------------------------------------------------------------------------------\n");

        System.out.println(user2);

        user2.paySalary();

        System.out.println("Balance + Salary = " + user2.getBalance());

        System.out.println("Balance - Summ = " + user2.withdraw(1000));

        System.out.println("companyNameLength = " + user2.companyNameLength());

        System.out.println("MonthsOfEmployment + addMonth = " + user2.monthIncreaser(5));

        System.out.println(user2.toString());

    }
}