import java.util.Scanner;

public class ddamax
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        int[][] a= new int[4][4];
        int i,j,max,min;
        System.out.println("Enter the elements into the 4x4 matrix:");
        for (i=0;i<4;i++) {
            for (j = 0; j < 4; j++) {
                a[i][j] = in.nextInt();
            }
        }
        max=a[0][0];
        min=a[0][0];
        for(i=0;i<4;i++)
        {
        for(j=0;j<4;j++)
        {
            if (a[i][j]>max)
                max=a[i][j];
            if (a[i][j]<min)
                min=a[i][j];
        }
    }
        System.out.println("The highest number in the matrix is: " + max);
        System.out.println("The lowest number in the matrix is: " + min);
   
}
}

