public class Timeaccount {
    double balance ,interest;
    public Timeaccount(double intal_balance)
    {
        balance=intal_balance;
        interest=((balance*10)/100);
    }
    public double display_balance()
    {
        return balance;
    }
    public void Add_interest()
    {
        balance=balance+interest;
        System.out.println(balance);
    }

    public void withdraw_balance(double withdraw_amount)
    {
        if(balance==withdraw_amount)
        {
            balance=balance-balance;
            System.out.println("Your full amount has been withdrawn successfully");
        }
        else
            System.out.println("sorry you can not withdraw partial of your balance or or greater than the amount deposited");
    }
    public void deposit_balance(double newer)
    {
        System.out.println("sorry you can not deposit another amount of money");
    }
}
