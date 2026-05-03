import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        System.out.println("Passwordvalidation: ");
        Scanner scan = new Scanner(System.in);
        passwordValidation(scan);
        scan.close();

    }

    private static void passwordValidation(Scanner scan) {
        boolean passwordAccepted = false;
        do {
            System.out.println("Please enter your Password: ");
            String password = scan.nextLine();
            passwordAccepted = PasswordValidator.isValid(password);
            if (! PasswordValidator.isValid(password)) {
                System.out.println("Password invalid. Try again. (Minimum length 8, At least 1 digit, 1 uppercase letter, 1 lowercase letter, don't use very common passwords)");
            }
            else{
                System.out.println("Password Accepted.");
                break;
            }
        } while ( ! passwordAccepted );
    }

}
