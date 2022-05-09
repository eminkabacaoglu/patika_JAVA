import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String currentUserName="eminkbc", currentPassword="123456", userNameInput,passwordInput,passwordInputNew;
        int choice;

        Scanner input = new Scanner(System.in);

        System.out.print("User Name: ");
        userNameInput = input.nextLine();

        System.out.print("Password: ");
        passwordInput = input.nextLine();


        if (currentUserName.equals(userNameInput)){ // string değişkenlerş ifadeler için == yerine equals kullanılır
            if (currentPassword.equals(passwordInput)){
                System.out.println("Login is successful");
            }
            else{
                System.out.println("Password is wrong.");
                System.out.println("Do you want to change your password ?\n1-No\n2-Yes");
                System.out.print("Choice: ");
                choice = input.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Good Bye");
                        break;
                    case 2:
                        System.out.print("Enter your new password: ");
                        input=new Scanner(System.in);
                        passwordInputNew = input.nextLine();

                        if(currentPassword.equals(passwordInputNew)){
                            System.out.println("Password couldn't be created. Try for a new password");
                        }
                        else {
                            currentPassword = passwordInputNew;
                            System.out.println("Password is created");
                        }break;

                    default:
                        System.out.println("Wrong Choice...");
                        break;
                }
            }
        }
        else {
            System.out.println("Wrong User Name...");
        }
    }
}
