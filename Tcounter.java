public class Tcounter {
    private int counter;
    public Tcounter()
    {
        counter=1;
    }
    public void set_click()
    {
        counter=counter+2;
    }
    public void get_value()
    {
        System.out.println(counter);
    }
    public void undo()
    {
        if(Math.max(counter,1)==counter&&counter!=1)
        {
            counter=counter-2;
            System.out.println(counter);
        }
        else System.out.println(1);
    }
}
