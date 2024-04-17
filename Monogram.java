import java.util.*;
public class Monogram {
    public static void main(String[]args){
        String it1;
        String it2;
        String it3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        it1 = input.next();
        System.out.print("Enter your middle initial: ");
        it2 = input.next();
        System.out.print("Enter your last name: ");
        it3 = input.next();
        String fn = it1.toLowerCase();
        fn=fn.substring(0,1);
        String mi = it2.toLowerCase();
        mi=mi.substring(0,1);
        String ln = it3.toLowerCase();
        ln=ln.substring(0,1);
        System.out.println("Your monogram is "+fn+mi+ln+".");

    }

    
}
