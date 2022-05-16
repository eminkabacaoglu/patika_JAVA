import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        double total=0;

        for (int i=1;i<=number;i++){
            total+=(1.0/i); // bölümü double a cevirmek için 1.0 a böldük (pratik bir işlem)
        }

        System.out.println("Result: "+total);
    }
}
