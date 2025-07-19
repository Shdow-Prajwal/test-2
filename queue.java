import java.util.Scanner;
public class queue
{
    int i,j,f=-1,r=-1,size;
    int q[];
    Scanner in=new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter the size of the queue");
        size=in.nextInt();
        q=new int[size];
        for(i=0;i<size;i++)
        q[i]=0;
    }
    void insert()
    {
        if(r==size-1)
        System.out.println("Queue overflow");
        else if(f==-1&&r==-1)
        {
        f=0;
        r=0;
        }
        else
        {
            r++;
            System.out.println("Enter the element to be inserted");
            int ele=in.nextInt();
            q[r]=ele;
        }
    }
    void delete()
    {
        if(f==-1&&r==-1)
        System.out.println("Queue underflow");
        else if(f==r)
        {
            f=-1;
            r=-1;
        }
        else
        {
            System.out.println("The element popped= "+q[f]);
            f++;
        }
    }
    void display()
    {
        for(i=0;i<size;i++)
        System.out.print(q[i]+" ");
    }
    public static void main(String args[])
    {
        queue obj=new queue();
    }
}