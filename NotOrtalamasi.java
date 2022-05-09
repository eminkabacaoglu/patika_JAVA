import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int matematikNot,fizikNot,kimyaNot,turkceNot,tarihNot,muzikNot;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz: ");
        matematikNot = input.nextInt();

        System.out.print("Fizik Notunu Giriniz: ");
        fizikNot = input.nextInt();

        System.out.print("Kimya Notunu Giriniz: ");
        kimyaNot = input.nextInt();

        System.out.print("Türkçe Notunu Giriniz: ");
        turkceNot = input.nextInt();

        System.out.print("Tarih Notunu Giriniz: ");
        tarihNot = input.nextInt();

        System.out.print("Müzik Notunu Giriniz: ");
        muzikNot = input.nextInt();

        int notToplam = matematikNot + fizikNot + kimyaNot + turkceNot + tarihNot + muzikNot;
        float notOrtalama = notToplam / 6f;
        // double notOrtalama = notToplam / 6.0; //şeklinde de yazabilirdik
        String durum = notOrtalama >60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalamanız: "+notOrtalama + "-->" +durum);


    }
}
