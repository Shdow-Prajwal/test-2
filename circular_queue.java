import java.util.Scanner;
public class circular_queue
{
    int q[]=new int[10];
    int f,r,i;
    Scanner in=new Scanner(System.in);
    circular_queue()
    {
        f=-1;
        r=-1;
        for(i=0;i<10;i++)
        q[i]=0;
    }
    void insert()
    {
        if((f==0&&r==9)||(f==r+1))
        {
            System.out.println("Overflow");
        }
        else if(f==-1&r==-1)
        {
            f=0;
            r=0;
        }
        else if(r==9)
        r=0;
        else
        {
            r++;
            System.out.println("Enter the elemet to be inserted");
            int ele=in.nextInt();
            q[r]=ele;
        }
    }
    void delete()
    {
        if(f==-1&&r==-1)
        System.out.println("Underflow");
        else if(f==r)
        {
            f=-1;
            r=-1;
        }
        else if(f==9)
        f=0;
        else
        {
            int val=q[f];
            f++;
            System.out.println("The element deleted= "+val);
        }
    }
    void display()
    {
        for(i=0;i<9;i++)
        System.out.print(q[i]+", ");
    }
    public static void main(String args[])
    {
        circular_queue ob=new circular_queue();
        Scanner in=new Scanner(System.in);
        int ch;
        char c;
        do
        {
            System.out.println("Enter 1 for insert, 2 for delete, 3 for display");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                ob.insert();
                break;
                case 2:
                ob.delete();
                break;
                case 3:
                ob.display();
                break;
                default: System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue??");
            c=in.next().charAt(0);
        }
        while(c=='y');
    }
}