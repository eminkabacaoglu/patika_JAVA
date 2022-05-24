import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int sayi, sum = 0, sum2 = 1, temp;

        Scanner scn = new Scanner(System.in);

        System.out.print("Fibbonacci serisi Eleman Sayısı: ");
        sayi= scn.nextInt();

        for (int i = 0; i <= sayi; i++){
            System.out.print(sum + " ");
            temp = sum + sum2;
            sum = sum2;
            sum2 = temp;

        }
    }
}
