import java.util.Scanner;
public class vowelconv
{
    public static void main(String args[])
    {
        int i;
        String s,s1;s1="";
        char c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=in.nextLine();
        s=" "+s;
        int l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if((c=='a')&&(s.charAt(i-1)==' ')&&(s.charAt(i+1)==' '))
            s1=s1+"an";
            else
            s1=s1+c;
        }
        
        System.out.println("The new sentence is -");
        System.out.println(s1);
    }
}