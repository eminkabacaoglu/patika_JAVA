import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int total=0, number = input.nextInt();
        boolean is_perfect=false;
        String result="Mükemmel Sayı Değildir.";
        if(number!=1){
            for(int i =1 ;i<number;i++){
                    if(number%i==0){
                        total+=i;
                    }
            }
            if(total==number){
                is_perfect=true;
                result ="Mükemmel Sayıdır";
            }
        }

        System.out.println(number+" "+result);
    }
}
