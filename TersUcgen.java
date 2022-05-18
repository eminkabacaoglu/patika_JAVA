import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = input.nextInt();

        for (int i = 0; i <= n-1 ; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = (n - i) * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
