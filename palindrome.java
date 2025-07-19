import java.util.Scanner;
public class palindrome
{
    public static void main(String args[])
    {
        int i,l;l=0;
        String s,s1;s1="";
        char c;c=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word");
        s=in.next();
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            s1=c+s1;
        }
        if(s.equals(s1)==true)
        System.out.println("The word is palindrome");
        else
        System.out.println("The word is not palindrome");

}    
}