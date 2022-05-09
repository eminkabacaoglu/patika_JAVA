import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        int gidilenKM;
        double kmUcret = 2.20, toplamTutar, acilisTutar = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen Mesafeyi KM Olarak Girin: ");
        gidilenKM = input.nextInt();
        toplamTutar = acilisTutar + (kmUcret * gidilenKM);

        toplamTutar = (toplamTutar > 20) ? toplamTutar : 20;

        System.out.println("Toplam Ödenecek Tutar: "+toplamTutar);
    }
}
