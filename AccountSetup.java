import java.util.*;
public class AccountSetup{
    public static void main(String[]args){
        String user;
        String password;
        int length;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a user: ");
        user = input.nextLine();
        System.out.print("Enter a password (password must be at least 8 characters): ");
        password = input.nextLine();
        length = password.length();
        while(length<8){
            System.out.print("Enter a password (password must be at least 8 characters): ");
            password = input.nextLine();
            length = password.length();
        }
        user = user.toLowerCase();
        password =  password.toLowerCase();
        System.out.print("Your username is "+user+" and your password is "+password+".");


    }
}