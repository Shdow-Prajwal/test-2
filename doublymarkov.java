import java.util.Scanner;
public class doublymarkov
{
    Scanner in=new Scanner(System.in);
    int n,i,j;
    double d;
    void accept()
    {
        System.out.println("Enter the size of the matrix");
        n=in.nextInt();
    }
    double A[][]=new double[10][10];
    void fill()
    {
        System.out.println("Enter the elements of the array");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            A[i][j]=in.nextDouble();
        }
    }
    boolean check1(double x[][])
    {
        int t=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
            if(x[i][j]>=0)
            t++;
            }
        }
        if(t==n*n)
        return true;
        else
        return false;
    }
    boolean check2(double x[][])
    {
        double sr,sc,t;t=0.0;sr=0.0;sc=0.0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                sr=sr+x[i][j];
                System.out.println("sr= "+sr);
                sc=sc+x[j][i];
                System.out.println("sc= "+sc);
            }
            if(sr==1.0&&sc==1.0)
            t++;
            sr=0.0;sc=0.0;
        }
        if(t==n)
        return true;
        else
        return false;
    }
    void check()
    {
        if(check1(A)==true&&check2(A)==true)
        System.out.println("The given matrix is markov");
        else
        System.out.println("The given matrix is not markov");
    }
    public static void main(String args[])
    {
        doublymarkov ob=new doublymarkov();
        ob.accept();
        ob.fill();
        ob.check();
    }

}