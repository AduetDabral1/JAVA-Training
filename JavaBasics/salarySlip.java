import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;
public class salarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        int ID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Age: ");
        int Age = sc.nextInt();
        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();
        Date date = new Date();

        //LOCALISATION
        Locale local = new Locale("en", "US"); 
        NumberFormat nf = NumberFormat.getCurrencyInstance(local);
        String formatSalary = nf.format(salary);

        //date style: DateFormat.LONG, DateFormat.SHORT
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, local);
        String formattedDate = df.format(date);
         

        String names[] = name.split(" ");
        String fullName = "";
        for(String n:names){
            n = String.valueOf(n.charAt(0)).toUpperCase() + n.substring(1).toLowerCase();
            fullName += n+" ";
        }

        System.out.println("\nOriginal Date: " + date);
        System.out.println("Formatted Date : "+formattedDate);
        System.out.println("Your details: " + ID + " " + fullName +" " + Age + " " +formatSalary);
    }
}
