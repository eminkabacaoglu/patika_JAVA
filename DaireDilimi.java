import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args) {
        int r,a;
        double pi =3.14,sonuc;

        Scanner input =new Scanner(System.in);
        System.out.print("YarıÇap Giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        a = input.nextInt();

        sonuc = (pi * (r*r)*a) / 360;

        System.out.println("Sonuç: "+ sonuc);
    }
}
