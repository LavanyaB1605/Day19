import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email Id");
        String mobileNumber = sc.nextLine();
       // String regex = "[A-Z][a-z]{6,}[0-9]{1,}[$&+,:;=?@#|'<>.-^*()%!][0-9]{1,}";
        String regex = "[A-Za-z0-9]{7,}[$&+,:;=?@#|'<>.-^*()%!]";
        boolean result = mobileNumber.matches(regex);
        if (result) System.out.println("Phone number is valid");
        else System.out.println("Phone number is Invalid");
    }
}