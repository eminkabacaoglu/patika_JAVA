import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        int sayi1,sayi2,secim;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayı: ");
        sayi1 = input.nextInt();
        System.out.print("2. Sayı: ");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seciminiz: ");
        secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplam: "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma: "+ (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma: "+ (sayi1*sayi2));
                break;
            case 4:
                switch (sayi2){
                    case 0:
                        System.out.println("Bir Sayı Sıfıra Bölünemez.");
                        break;
                    default:
                        System.out.println("Bölme: " + (sayi1*1.0/sayi2*1.0)); // sonucun ondalık olması durumuna karsı sayı1 ve sayı2 yi 1.0 ile çarparak ondalıklıya dönüştürdük
                        break;
                }

            default:
                System.out.println("Yanlış Seçim Yaptınız.");
                break;
        }
    }
}
