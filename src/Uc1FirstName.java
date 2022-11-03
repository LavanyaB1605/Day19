import java.util.Scanner;

public class Uc1FirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String FirstName = sc.next();
        String RegEx = "[A-Z][a-z]{3,}";
        boolean check = FirstName.matches(RegEx);
        if(check) {
            System.out.println("Entered name is valid");
        }
        else {
            System.out.println("Entered name is not valid");
        }
    }
}