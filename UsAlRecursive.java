import java.util.Scanner;

public class UsAlRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban degeri: ");
        int taban =input.nextInt();
        System.out.print("Taban degeri: ");
        int us =input.nextInt();
        System.out.println("Sonuc: "+ usAl(taban,us));
    }
    static int usAl(int taban, int us){
        if(us==0) {
            return 1;
        }
        return taban*usAl(taban,us-1);
    }
}
