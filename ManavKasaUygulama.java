import java.util.Locale;
import java.util.Scanner;

public class ManavKasaUygulama {
    public static void main(String[] args) {

        double fiyatArmut=2.14 , fiyatElma=3.67, fiyatDomates=1.11, fiyatMuz=0.95, fiyatPatlicanatlican = 5,
        kiloArmut,kiloElma,kiloDomates,kiloMuz,kiloPatlican, totalTutar;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Armut Kaç Kilo ? :");
        kiloArmut = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        kiloElma = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        kiloDomates = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        kiloMuz = input.nextDouble();
        System.out.print("Patlican Kaç Kilo ? :");
        kiloPatlican = input.nextDouble();

        totalTutar = kiloArmut*fiyatArmut + kiloElma*fiyatElma + kiloDomates*fiyatDomates + kiloMuz*fiyatMuz + kiloPatlican*fiyatPatlicanatlican;

        System.out.println("Toplam Tutar: "+totalTutar+ " TL");

    }
}
