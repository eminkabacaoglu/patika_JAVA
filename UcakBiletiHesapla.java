import java.util.Scanner;

public class UcakBiletiHesapla {
    public static void main(String[] args) {


        int km, yas,secim,biletKatSayi=1;
        double kmUcret=0.10, totalTutar=0,tipOran=0,tipIndirim,yasIndırım;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden Giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk Tipi Giriniz (1=>Tek Yön , 2=> Gidiş Dönüş) : ");
        secim = input.nextInt();

        if(km>=0 && yas>=0){
            switch (secim){
                case 1:
                    tipOran=0;
                    break;
                case 2:
                    tipOran=0.2;
                    biletKatSayi=2;
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız.");
                    break;
            }
            totalTutar = km * kmUcret;
            if(yas<12){
                yasIndırım = totalTutar*0.5;
                tipIndirim = (totalTutar - yasIndırım) * tipOran;
                totalTutar -= (yasIndırım+tipIndirim);
            }
            else if(yas>=12 && yas<=24){
                yasIndırım = totalTutar*0.1;
                tipIndirim = (totalTutar - yasIndırım) * tipOran;
                totalTutar -= (yasIndırım+tipIndirim);
            }
            else if(yas>=65){
                yasIndırım = totalTutar*0.3;
                tipIndirim = (totalTutar - yasIndırım) * tipOran;
                totalTutar -= (yasIndırım+tipIndirim);
            }
            else {
                yasIndırım = totalTutar * 0;
                tipIndirim = (totalTutar - yasIndırım) * tipOran;
                totalTutar -= (yasIndırım+tipIndirim);
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz.");
        }
        System.out.println("Totlam Tutar: "+(totalTutar*biletKatSayi)+" TL");
    }
}
