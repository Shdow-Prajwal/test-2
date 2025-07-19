import java.util.Scanner;
public class date
{
    int n,i,d,N,y,yn;
    String mon[]={"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
    int day[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    Scanner in=new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter the day number,year and the value of N");
        n=in.nextInt();
        y=in.nextInt();
        N=in.nextInt();
        if(n<1||n>366||N<1||N>100)
        {
        System .out.println("Incorrect values");
        System.exit(0);
        }
    }
    void leapcheck()
    {
        yn=365;
        if((y%400==0)||((y%100!=0)&&(y%4==0)))
        {day[2]=29;
        yn=366;}
    }
    void datecalc(int x)
    {
        int s,i;s=0;i=0;
        String m;m="";
        while(s<x)
        {
            s=s+day[i];
            i++;
        }
        s=s-x;
        d=day[i-1]-s;
        m=mon[i-1];
        System.out.println(d+" "+m+" "+y);
    }
    void skip()
    {
        int t;
        t=n+N;
        if(t>yn)
        {
            t=t-yn;
        }
        datecalc(t);
    }
    void display()
    {
        datecalc(n);
        skip();
    }

    public static void main(String args[])
    {
        date ob=new date();
        ob.accept();
        ob.leapcheck();
        ob.display();
    }
} 