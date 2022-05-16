import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        int number, power;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        number= input.nextInt();
        System.out.print("Enter Power: ");
        power= input.nextInt();

        int result = 1;

        for (int i=1;i<=power;i++){
            result*=number;
        }

        System.out.println(number+"^"+power+": "+result);
    }
}
