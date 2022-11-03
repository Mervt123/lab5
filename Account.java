public class Account  {
    private double balance ,interest;
        public Account(double intial)
        {
            balance=interal;
            interest= ((balance*10)/100);
        }
        public void addInterest()
        {
            balance =balance+interest;
        }
        public void GetBalance()
        {
            System.out.println(balance);
        }
}
