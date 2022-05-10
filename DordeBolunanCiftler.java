import java.util.Scanner;

public class DordeBolunanCiftler {
    public static void main(String[] args) {
        int sayi, toplam=0, sayac=0;
        double average;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Sayi Giriniz:");
            sayi = input.nextInt();
            if (sayi%4==0){
                toplam +=sayi;
            }
        }while (sayi%2 != 1);
        System.out.println("4'ün Katlarının Toplamı: "+toplam);
    }
}
