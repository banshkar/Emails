import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Emails {
    public  void validEmail(String email){
        Pattern pattern =Pattern.compile("^[a-zA-Z]+[.]+[0-9]{3}?(@)+[a-z]+?(.)+[a-z]{3}+$");
        Matcher check =pattern.matcher(email);
        if(check.matches()){
            System.out.println("Email valid ");
        }
        else {
            System.out.println("Email not valid ");
        }
    }
    public static void main(String[] args) {
        Emails emails =new Emails();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Email Id");
        String email =sc.nextLine();
        emails.validEmail(email);
    }
}
