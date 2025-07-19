import java.util.Scanner;
public class emirprec
{
    int check(int x,int n,int t)
    {
        if(n==0)
        {
            int te=0;
            for(int i=1;i<=t;i++)
            if(t%i==0)
            te++;
            for(int i=1;i<=x;i++)
            if(x%i==0)
            te++;
            if(te==4)
            return 1;
            else return 0;
        }
        else
        {
            t=(t*10)+(n%10);
            return(check(x,n/10,t));
        }
    }
    public static void main(String args[])
    {
        emirprec obj=new emirprec();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        if(obj.check(num,num,0)==1)
        System.out.println("The number is emirp");
        else
        System.out.println("The number is not emirp");
    }
}