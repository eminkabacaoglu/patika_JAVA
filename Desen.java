import java.util.Scanner;

public class Desen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Sayı: ");
        int sayi = in.nextInt();

        metot(sayi, 5, true, 0);

    }

    static int metot(int sayi, int x, boolean y, int counter) {
        System.out.print(sayi+" ");
        if (sayi > 0 && y == true) {
            counter++;
            sayi -= x;
            return metot(sayi, x, y, counter);
        } else {
            y = false;
            sayi += x;
            counter--;
            if (counter >= 0) {
                return metot(sayi, x, y, counter);
            } else
                return sayi;
        }

    }

}
