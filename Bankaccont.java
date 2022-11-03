public class Bankaccont {
    private double balance;
    public void Setdeposits(double amou)
    {
        balance = balance + amou;
    }

    public void Setwithdraws(double amount)
    {
        balance = balance - amou;
    }

    public void get_Remaining_Balance() {System.out.println(balance);}

    public void AddInterest()
    {
        double r = ((balance*10)/100);
        balance=balance+r;
    }
}
