import java.util.Scanner;
import java.util.Locale;

public class KdvHesaplama {
    public static void main(String[] args) {
        float fiyat, kdvOran,kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("KDV'siz Fiyat : ");
        fiyat = input.nextFloat();
        kdvOran = fiyat > 1000 ? 0.08f : 0.18f;
        kdvTutar = kdvOran * fiyat;
        kdvliTutar = fiyat * (1+kdvOran);
        System.out.println("KDV Oranı(%) : " + kdvOran*100);
        System.out.println("KDV'li Fiyat : "+ kdvliTutar);
        System.out.println("KDV Tutarı: "+kdvTutar);



    }
}
