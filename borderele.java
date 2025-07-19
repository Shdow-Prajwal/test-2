import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matrix = new int[4][4];
    int sum = 0;

    System.out.println("Enter the elements of the 4x4 matrix: ");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if (i == 0 || i == 3 || j == 0 || j == 3) {
          sum += matrix[i][j];
        }
      }
    }

    System.out.println("Sum of the border elements: " + sum);
  }
}
