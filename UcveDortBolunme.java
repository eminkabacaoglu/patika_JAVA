import java.util.Scanner;

public class UcveDortBolunme {
    public static void main(String[] args) {
        int sayi, toplam=0, sayac=0;
        double average;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz:");
        sayi = input.nextInt();

        for (int i = 1 ; i<=sayi;i++){
            if (i%12==0){
                toplam +=i;
                sayac++;
            }
        }
        average = toplam / sayac;
        System.out.println("3 ve 4'e Tam Bölünen Sayıların Ortalaması: " + average);
    }
}
