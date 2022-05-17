import java.util.Scanner;

public class MIN_MAX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();
        int min = 0, max = 0 ;

        for (int i=1 ; i<=n;i++){
            System.out.print(i+". Sayi: ");
            int sayi = input.nextInt();
            if(i==1){
                max=sayi;
                min=sayi;
            }else {
                if(sayi>=max){
                    max=sayi;
                }
                else if(sayi<=min){
                    min=sayi;

                }
            }

        }
        System.out.println("En Büyük Sayı: "+max+"\n"+
                           "En Küçük Sayı: "+min+"\n");
    }
}
