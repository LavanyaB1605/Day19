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
        System.out.println("Please enter last name:");
        String LastName = sc.next();
        boolean check1 = LastName.matches(RegEx);
        if(check1) {
            System.out.println("Entered name is valid");
        }
        else {
            System.out.println("Entered name is not valid");
        }
        System.out.println("Please enter Email Id:");
        String Email = sc.next();
        boolean check2 = Email.matches(RegEx);
        if(check1) {
            System.out.println("Entered ID is valid");
        }
        else {
            System.out.println("Entered ID is not valid");
        }
    }
}
