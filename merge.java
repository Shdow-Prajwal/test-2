import java.util.Scanner;

public class merge
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[20];
        int i;
        System.out.println("Enter 10 elements into the first array:");
        for (i = 0; i < 10; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("Enter 10 elements into the second array:");
        for (i = 0; i < 10; i++) {
            arr2[i] = in.nextInt();
        }
        for (i = 0; i < 10; i++) {
            arr3[i] = arr1[i];
        }
        for (i = 10; i < 20; i++) {
            arr3[i] = arr2[i - 10];
        }
        System.out.println("Merged array: ");
        for (i = 0; i < 20; i++) {
        System.out.print(arr3[i] + " ");
        }
    }
}