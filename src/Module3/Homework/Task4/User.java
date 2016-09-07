package Module3.Homework.Task4;

/**
 * Created by Serg-fam on 01.09.2016 on 17:04.
 */
class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary() {
        balance += salary;
    }

    void withdraw(int summ) {
        final double commission;
        if (summ < 1000) {
            commission = summ * 0.1;
        } else {
            commission = summ * 0.05;
        }
        balance -=summ + commission;

        System.out.println("Balance - Summ " + summ + " = " + balance);
    }

    int companyNameLength() {
        return (companyName.length());
    }

    void monthIncreaser(int addMonth) {
        int monthIncreaser = monthsOfEmployment + addMonth;
        System.out.println("MonthsOfEmployment + addMonth " + addMonth + " = " + monthIncreaser);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", monthsOfEmployment=" + monthsOfEmployment +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", currency='" + currency + '\'' +
                '}';
    }
}
