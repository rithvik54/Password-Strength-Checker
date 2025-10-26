import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        sc.close();

        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) score++;

        switch (score) {
            case 5:
                System.out.println("Password Strength: 🔥 Very Strong");
                break;
            case 4:
                System.out.println("Password Strength: 💪 Strong");
                break;
            case 3:
                System.out.println("Password Strength: 🙂 Medium");
                break;
            case 2:
                System.out.println("Password Strength: 😐 Weak");
                break;
            default:
                System.out.println("Password Strength: ❌ Very Weak");
        }
    }
}
