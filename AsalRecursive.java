import java.util.Scanner;

public class AsalRecursive {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int sayi  = input.nextInt();
        if(is_Asal(sayi,2)){
            System.out.println("Sayı Asaldır");
        }
        else {
            System.out.println("Sayı Asal degildir");
        }

    }

    static boolean is_Asal(int sayi,int i){
        if(i < sayi)
        {
            if(sayi % i != 0)
            {
                return(is_Asal(sayi, ++i));
            }
            else
            {
                return false;
            }
        }
        return true;

    }
}
