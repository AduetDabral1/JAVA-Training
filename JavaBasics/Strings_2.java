import java.util.*;
public class Strings_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        String names[] = name.split(" ");
        String fullName = "";
        // for(String n:names){
        //     System.out.println(name);
        // }
        for(String n:names){
            n = String.valueOf(n.charAt(0)).toUpperCase() + n.substring(1).toLowerCase();
            fullName += n+" ";
        }

        System.out.println("Welcome "+ fullName);
    }
    
}
