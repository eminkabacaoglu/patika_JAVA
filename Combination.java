import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();

        System.out.print("r: ");
        int r = input.nextInt();

        int factorialR=1, factorialN=1,factorialNR=1;
        for (int i=1; i<=r;i++){
            factorialR*=i;
        }

        for (int i=1; i<=n;i++){
            factorialN*=i;
        }

        for (int i=1; i<=(n-r);i++){
            factorialNR*=i;
        }

        int result = factorialN / (factorialR * factorialNR);
        System.out.println("C(n,r): " + result);
    }
}
