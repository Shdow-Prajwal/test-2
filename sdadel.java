import java.util.Scanner;
public class sdadel
{
    public static void main(String args[])
    {
        int i,n;
        int a[]=new int[100];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(i=0;i<10;i++)
        a[i]=in.nextInt();
        System.out.println("Enter the position of the element to be deleted");
        n=in.nextInt();
        for(i=n;i<9;i++)
        {
            a[i]=a[i+1];
        }
        System.out.println("The new array after deletion is");
        for(i=0;i<9;i++)
        System.out.print(a[i]+",");
    }
}