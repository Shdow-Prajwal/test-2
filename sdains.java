import java.util.Scanner;

public class sdains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int i,num,pos;
        System.out.println("Enter 10 elements into the array:");
        for (i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be inserted: ");
        num = sc.nextInt();
        System.out.print("Enter the position number: ");
        pos = sc.nextInt();
        for (i = 9; i >= pos - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = num;
        System.out.println("Array after insertion: ");
        for (i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
