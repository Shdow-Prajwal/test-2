import java.util.Scanner;
import java.util.StringTokenizer;
public class conso
{
    Scanner in=new Scanner(System.in);
    String s,s1;
    int i,j;
    char c,v;
    void accept()
    {
        System.out.println("Enter a sentence");
        s=in.nextLine();
        if(s.charAt(s.length()-1)!='.'&&s.charAt(s.length()-1)!='?'&&s.charAt(s.length()-1)!='!')
        {
            System.out.println("INCORRECT TERMINATING CHARACTER. INVALID INPUT");
            System.exit(0);
        }
    }
    void count()
    {
        s=s.substring(0,s.length()-1);
        int t,x;t=0;x=0;
        StringTokenizer st=new StringTokenizer(s);
        System.out.println("Word\t\t\tcount");
        while(st.hasMoreTokens())
        {
            t=0;x=0;
            s1=st.nextToken();
            System.out.print(s1+"\t\t\t");
            for(i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            t++;
            else
            x++;
        }
        System.out.print(t);
        for(i=0;i<t;i++)
        System.out.print("V");
        System.out.println();
        for(i=0;i<x;i++)
        System.out.print("\t\t\tC");
        System.out.println();
        }
    }
    public static void main(String args[])
    {
        conso ob=new conso();
        ob.accept();
        ob.count();
    }

}