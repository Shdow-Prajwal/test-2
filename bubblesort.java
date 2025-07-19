import java.util.Scanner;
public class bubblesort
{
    int num,bin;
    String st="";
    bubblesort()
    {
        num=0;
        bin=0;
    }
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number in decimal number system");
        num=in.nextInt();
    }
    void rec_bin(int x)
    {
        if(x==0)
        bin=Integer.valueOf(st);
        else
        {
            st=(x%2)+st;
            rec_bin(x/2);
        }
    }
    void check()
    {
        rec_bin(num);
        int t=0;
        for(int i=0;i<(st.length());i++)
        {
            if((bin%10)==1)
            t++;
            bin=bin/10;
        }
        if(t%2==0)
        System.out.println("The number is evil");
        else
        System.out.println("The number is not evil");
    }
    public static void main(String args[])
    {
        bubblesort obj=new bubblesort();
        obj.accept();
        obj.check();
    }

}