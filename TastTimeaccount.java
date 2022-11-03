public class TastTimeaccount {
    public static void main(String[] args) {
        Timeaccount b=new  Timeaccount(5000);
        System.out.println(b.displaybalance());
        b.Addinterest();
        b. withdrawbalance(2200);
        System.out.println(b.displaybalance());
    }
}
