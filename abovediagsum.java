import java.util.Scanner;

public class abovediagsum 
{
  public static void main(String[] args) 
  {
    Scanner in=new Scanner(System.in);
    int[][] matrix=new int[5][5];
    int i,j;
    System.out.println("Enter the elements of the 5x5 matrix: ");
    for (i=0;i<5;i++) {
      for (j=0;j<5;j++) {
        matrix[i][j]=in.nextInt();
      }
    }
    System.out.println("Elements above the left diagonal: ");
    for (i=0;i<5;i++) {
      for (j=0;j<5;j++) {
        if (i<j) 
          System.out.print(matrix[i][j] + " ");
        
      }
    }
  }
}
