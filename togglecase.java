import java.util.Scanner;
public class togglecase
{
    public static void main(String args[])
    {
        int i,l;l=0;
        String s,s1;s1="";
        char c;c=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=in.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(Character.isUpperCase(c)==true)
            c=Character.toLowerCase(c);
            else
            c=Character.toUpperCase(c);
            s1=s1+c;
        }
        System.out.println("The new sentence is");
        System.out.println(s1);
    }
}