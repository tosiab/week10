import java.util.*;
public class RemoveString {
    public static void main(String[]args){
        String word;
        String sentance;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentance: ");
        sentance = input.nextLine();
        System.out.print("Enter a string: ");
        word = input.nextLine();
        System.out.print(sentance.replace(word+" ",""));
    }
    
}
