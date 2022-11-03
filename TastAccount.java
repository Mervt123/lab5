public class TastAccount {
    public static void main(String[] args) {
        Account acco=new Account(1000);
        acco.addInterest();
        acco.GetBalance();
        System.out.println("exp balance = "+1100);
    }
}
