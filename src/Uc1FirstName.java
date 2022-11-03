import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Uc1FirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String FirstName = sc.nextLine();
        String RegEx = "[A-Z][a-z]{3,}";
        boolean check = FirstName.matches(RegEx);
        if(check) {
            System.out.println("Entered name is valid");
        }
        else {
            System.out.println("Entered name is not valid");
        }
        System.out.println("Please enter last name:");
        String LastName = sc.nextLine();
        boolean check1 = LastName.matches(RegEx);
        if(check1) {
            System.out.println("Entered name is valid");
        }
        else {
            System.out.println("Entered name is not valid");
        }
        System.out.println("Please enter Email Id:");
        String Email = sc.nextLine();
        String RegEx1 = "^[A-Za-z0-9+_.-]+@(.+)$";
        boolean check2 = Email.matches(RegEx1);
        if(check2) {
            System.out.println("Entered ID is valid");
        }
        else {
            System.out.println("Entered ID is not valid");
        }
       System.out.println("Please enter Phone Number:");
        String num = sc.nextLine();
        //String RegEx2 = "[91]{2} [6-9]{1}[0-9]{9}";
        String RegEx2 = "[91]{2} [6-9]{1}[0-9]{9}";
        Pattern pattern = Pattern.compile(RegEx2);
        Matcher matcher = pattern.matcher(num);
        System.out.println(num +" : "+ matcher.matches());
    }
}
