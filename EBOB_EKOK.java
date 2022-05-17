import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı 1 giriniz: ");
        int n1 = input.nextInt();
        System.out.print("Sayı 2 giriniz: ");
        int n2 = input.nextInt();
        int i =1,min=n1, ebob=1;
        if(n1>n2){
            min=n2;
        }
        while (i<=min){
            if(n1%i==0 && n2%i==0){
                ebob=i;
            }
            i++;
        }
        int ekok = (n1*n2)/ebob;

        System.out.println("Ebob: "+ebob+"\n"+
                           "Ekok: "+ekok);


    }
}
