import java.util.Scanner;

public class diagsum 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int[][] matrix=new int[4][4];
    int sum,i,j;sum=0;
    System.out.println("Enter the elements of the 4x4 matrix: ");
    for (i=0;i<4;i++) {
      for (j=0;j<4;j++) {
        matrix[i][j] = in.nextInt();
      }
    }
    for (i=0;i<4;i++) {
      sum += matrix[i][i];
    }
    System.out.println("Sum of the left diagonal elements: " + sum);
  }
}
