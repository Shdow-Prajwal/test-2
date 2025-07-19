import java.util.Scanner;
public class letterorder
{
    public static void main(String args[])
    {
        int i,l,j;
        String s,s1;s1="";
        char c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word");
        s=in.next();
        l=s.length();
        for(j=65;j<90;j++)
        {
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c==(char)j)
            s1=s1+c;
        }
    }
        System.out.println("The new word after rearranging is- "+s1);
    }
}
