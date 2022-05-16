import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n - 1; i++) {

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
