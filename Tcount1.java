import java.util.Scanner;

public class Tcount1 {
    private int limit,click;
    public Tcount1()
    {
        limit=0;
        click=0;
    }
    public void setnum()
    {
        System.out.println(" enter  of the num");
        Scanner in=new Scanner(System.in);
        int maximum= in.nextInt();
        limit=maximum;
    }
    public void setclick()
    {
        System.out.println(" enter  of the click");
        Scanner in=new Scanner(System.in);
        click= in.nextInt();

    }
    public void getRes()
    {
        if(Math.min(click,limit)==click)
            System.out.println(click);
        else
            System.out.println(limit);

    }
}
