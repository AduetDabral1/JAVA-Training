//Function to create a Fibonacci Series

        // import java.util.*;
        // public class functions {
        //     public static void printFibonacci(int n){
        //         int a=0;
        //         int b=1;
        //         System.out.print(a + " " + b);
        //         int sum;
        //         for(int i=1; i<=n-2;i++){
        //             sum = a + b;
        //             System.out.print(" "+ sum);
        //             a = b;
        //             b = sum;
        //         }

        //         return;
        //     }
        //     public static void main(String[] args) {
        //         Scanner sc = new Scanner(System.in);
        //         int n = sc.nextInt();
        //         printFibonacci(n);
        //     }
            
        // }


//Function to find the GCD of 2 numbers
import java.util.*;
public class functions {
    public static void printGCD(int n1, int n2){
        // int max;
        // if (x>y)    max=x;
        // else    max=y;
        // int n=0;
        // for(int i=2;i<=max/2;i++){
        //     if(x%i==0 && y%i==0)
        //         n=i;
        // }
        // if(n==0)
        //     System.out.println("GCD is: 1" );
        // else
        //     System.out.println("GCD is: " + n);
         
       while(n1 != n2) { 
        if(n1>n2) 
            n1 = n1 - n2;
             else 
            n2 = n2 - n1;
       }
        System.out.println("GCD is: " + n2);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printGCD(a,b);
    }
    
}
