public class TestBankaccont {
    public static void main(String[] args) {
        Bankaccont account=new Bankaccont();
        account.Setdeposits(2000);
        account.Setwithdraws(300);
        account.Setwithdraws(600);
        account.get_Remaining_Balance();
        System.out.println("expected result = "+200);
        account.Setdeposits(800);
        account.AddInterest();
        account.get_Remaining_Balance();
        System.out.println("expected result = "+2100);


    }
}
