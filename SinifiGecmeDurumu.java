import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, gecmeNotu=55, toplamNot=0 ,dersSay=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        if (matematik>=0 && matematik<=100){
            toplamNot+=matematik;
            dersSay++;
        }

        if (fizik>=0 && fizik<=100){
            toplamNot+=fizik;
            dersSay++;
        }
        if (turkce>=0 && turkce<=100){
            toplamNot+=turkce;
            dersSay++;
        }
        if (kimya>=0 && kimya<=100){
            toplamNot+=kimya;
            dersSay++;
        }
        if (muzik>=0 && muzik<=100){
            toplamNot+=muzik;
            dersSay++;
        }

        double ortalama=0;

        if(dersSay>0){
            ortalama = toplamNot/dersSay;
        }


        if (ortalama>55){
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }
        else {
            System.out.println("Sınıfı Geçemediniz");
        }
        System.out.println("Ortalamanız: " + ortalama);
    }
}
