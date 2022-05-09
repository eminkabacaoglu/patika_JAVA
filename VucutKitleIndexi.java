import java.util.Locale;
import java.util.Scanner;

public class VucutKitleIndexi {
    public static void main(String[] args) {
        double boy,kilo, vucutKitleIndexi;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Boyunuzu metre cinsinden Giriniz (örn: 1.75): ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden Giriniz: ");
        kilo = input.nextDouble();
        vucutKitleIndexi = kilo / (Math.pow(boy,2));
        System.out.println("Vücut Kitle İndeksiniz: "+vucutKitleIndexi);
    }
}
