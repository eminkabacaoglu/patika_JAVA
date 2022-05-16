import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = input.nextInt();
        int temp = number;
        int result = 0;
        while (temp != 0) {
            result += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of Digits : " + result);
    }

}
