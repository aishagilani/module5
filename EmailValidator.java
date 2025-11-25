import java.util.Scanner;
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        try {
            if (!email.contains("@")) {
                throw new InvalidEmailException("Invalid Email: '@' missing!");
            }
            System.out.println("Valid Email!");
        } 
        catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
