import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        int number = input.nextInt();
        if(isPalindrom(number)){
            System.out.println("Sayı Palindromdur");
        }
        else{
            System.out.println("Sayı Palindrom değildir");
        }

    }
    static boolean isPalindrom(int sayi) {
        int temp = sayi, reverse = 0;
        while (temp != 0) {
            int num = temp % 10;
            temp /= 10;
            reverse = (reverse * 10) + num;
        }
        System.out.println("Sayının Tersi " + reverse);
        if (sayi == reverse) {
            return true;
        } else {
            return false;
        }

    }


}
