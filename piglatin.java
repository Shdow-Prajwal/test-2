import java.util.Scanner;
import java.util.StringTokenizer;
public class piglatin
{
    public static void main(String args[])
    {
        int i;
        String s,t,st1,st2;st1="";st2="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        s=in.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            t=st.nextToken();
            i=t.length();
            for(int j=0;j<i;j++)
            {
                char c=t.charAt(j);
                if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='I')||(c=='O')||(c=='E')||(c=='U'))
                {
                st1=t.substring(0,j);
                st2=t.substring(j);
                break;
                }
            }
            t=st2+st1+"ay";
            System.out.println(t);
            t="";
        }
    }
}