import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {
        int day, month;

        Scanner input = new Scanner(System.in);


        System.out.println("Kaçıncı Ayda Doğdunuz (1-12): ");
        month = input.nextInt();
        System.out.println("Kaçıncı Gün Doğdunuz : ");
        day = input.nextInt();

        if (month ==1 ){
            if (day>31 || day<1){
                System.out.println("Ocak Ayında 31 Gün var");
            }
            else {
                if(day>=1 && day<=21){
                    System.out.println("Burcunuz Oğlak");
                }
                else {
                    System.out.println("Burcunuz Kova");
                }
            }
        }

        else if(month==2){
            if (day>28 || day<1){
                System.out.println("Şubat Ayında 28 Gün var");
            }
            else {
                if(day>=1 && day<=19){
                    System.out.println("Burcunuz Kova");
                }
                else {
                    System.out.println("Burcunuz Balık");
                }
            }
        }

        else if(month==3){
            if (day>31 || day<1){
                System.out.println("Mart Ayında 31 Gün var");
            }
            else {
                if(day>=1 && day<=20){
                    System.out.println("Burcunuz Balık");
                }
                else {
                    System.out.println("Burcunuz Koç");
                }
            }
        }

        else if(month==4){
            if (day>30 || day<1){
                System.out.println("Nisan Ayında 30 Gün var");
            }
            else {
                if(day>=1 && day<=20){
                    System.out.println("Burcunuz Koç");
                }
                else {
                    System.out.println("Burcunuz Boğa");
                }
            }
        }

        else if(month==5){
            if (day>31 || day<1){
                System.out.println("Mayıs Ayında 31 Gün var");
            }
            else {
                if(day>=1 && day<=21){
                    System.out.println("Burcunuz Boğa");
                }
                else {
                    System.out.println("Burcunuz İkizler");
                }
            }
        }
        else if(month==6){
            if (day>30 || day<1){
                System.out.println("Haziran Ayında 30 Gün var");
            }
            else {
                if(day>=1 && day<=22){
                    System.out.println("Burcunuz İkizler");
                }
                else {
                    System.out.println("Burcunuz Yengeç");
                }
            }
        }
        else if(month==7){
            if (day>31 || day<1){
                System.out.println("Temmuz Ayında 31 Gün var");
            }
            else {
                if(day>=1 && day<=22){
                    System.out.println("Burcunuz Yengeç");
                }
                else {
                    System.out.println("Burcunuz Aslan");
                }
            }
        }

        else if(month==8){
            if (day>31 || day<1){
                System.out.println("Ağustos Ayında 31 Gün var");
            }
            else {
                if(day>=1 && day<=22){
                    System.out.println("Burcunuz Aslan");
                }
                else {
                    System.out.println("Burcunuz Başak");
                }
            }
        }
        else if(month==9){
            if (day>30 || day<1){
                System.out.println("Eylül Ayında 30 Gün var");
            }
            else {
                if(day>=1 && day<=22){
                    System.out.println("Burcunuz Başak");
                }
                else {
                    System.out.println("Burcunuz Terazi");
                }
            }
        }
        else if(month==10){
            if (day>31 || day<1){
                System.out.println("Ekim Ayında 31 Gün var");
            }
            else {
                if(day>=1 && day<=22){
                    System.out.println("Burcunuz Terazi");
                }
                else {
                    System.out.println("Burcunuz Akrep");
                }
            }
        }
        else if(month==11){
            if (day>30 || day<1){
                System.out.println("Kasım Ayında 30 Gün var");
            }
            else {
                if(day>=1 && day<=21){
                    System.out.println("Burcunuz Akrep");
                }
                else {
                    System.out.println("Burcunuz Yay");
                }
            }
        }
        else if(month==12){
            if (day>31 || day<1){
                System.out.println("Aralık Ayında 31 Gün var");
            }
            else {
                if(day>=1 && day<=21){
                    System.out.println("Burcunuz Yay");
                }
                else {
                    System.out.println("Burcunuz Oğlak");
                }
            }
        }
        else {
            System.out.println("Böyle bir ay yok.");
        }
    }
}
