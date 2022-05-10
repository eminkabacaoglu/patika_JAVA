import java.util.Scanner;

public class ArtikYilBul {
    public static void main(String[] args) {
        int yil;
        boolean durum=false;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();
        if (yil%100==0){
            int bolum=yil/100;
            if(bolum%4==0){
                durum=true;
            }
        }
        else {
            if (yil%4==0){
                durum=true;
            }
        }
        if (durum){
            System.out.println(yil+" yılı artık yıldır.");
        }
        else {
            System.out.println(yil+" yılı artık yıl değildir.");
        }
    }
}
