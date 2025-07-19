import java.util.Scanner;

public class threeletcomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three letter word: ");
        String word = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && j != k && k != i) {
                        System.out.println(word.charAt(i) + "" + word.charAt(j) + "" + word.charAt(k));
                    }
                }
            }
        }
    }
}
