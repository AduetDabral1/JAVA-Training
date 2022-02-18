//Name: Aduet Dabral
//SAP ID: 1000013239
//Program: B.Tech CSE (AI-DS) A
//Batch 2 Technical Training


import java.util.*;
import java.lang.Math;
public class Assignment1_AduetDabral {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // 1. Write a program to calculate the factorial of a number entered by the user.
                    int factorial=1;
                    int num = x;
                    while(num>=1){
                        factorial *= num;
                        num--;
                    }
                    System.out.println("The factorial of " + x + " is: " + factorial);


        // 2. Write a program to print the Fibonacci series(the count of numbers is entered by the user).
                    int a=0;
                    int b=1;
                    int next;
                    System.out.println("The Fibonacci series is: ");
                    System.out.print(a + " " + b);
                    for(int i=1;i<=x-2;i++){
                        next = a + b;
                        System.out.print(" " + next);
                        a = b;
                        b = next;
                    }


        // 3. Write a program to determine whether the number entered by the user is an Armstrong Number or not.
                    int number = x;
                    int sum = 0;
                    int rem;
                    while(x>0){
                        rem = x%10;
                        sum += Math.pow(rem,3);
                        x /= 10;
                    }
                    if(sum == number)
                        System.out.println("The number " + number + " is an Armstrong Number.");
                    else
                        System.out.println("The number " + number + " is not an Armstrong Number.");


        // 4. Questions to draw patterns
        int n = 5;

        // *****
        // *****
        // *****
        // *****
        // *****
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=n;j++)
                                System.out.print("*");
                            System.out.println();
                        }

        // *****
        // *   *
        // *   *
        // *   *
        // *****
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=n;j++){
                                if(i==1 || j==1 || i==n || j==n)
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            }
                            System.out.println();
                        }

        // *****
        // ** **
        // * * *
        // ** **
        // *****
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=n;j++){
                                if(i==1 || j==1 || i==n || j==n || i==j || i+j==6)
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            }
                            System.out.println();
                        }

        //     *****
        //    *****
        //   *****
        //  *****
        // *****
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=(n-i);j++)
                                System.out.print(" ");
                            for(int j=1;j<=n;j++)
                                    System.out.print("*");
                            System.out.println();
                        }

        //    *****
        //    *   *
        //   *   *
        //  *   *
        // *****
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=(n-i);j++)
                                System.out.print(" ");
                            for(int j=1;j<=n;j++){
                                if(i==1 || i==n || j==1 ||  j==n)
                                    System.out.print("*");
                                else 
                                    System.out.print(" ");
                            }
                                    
                            System.out.println();
                        }

        // *****
        //  *****
        //   *****
        //    *****
        //     *****
                        for(int i=n;i>=1;i--){
                            for(int j=1;j<=(n-i);j++)
                                System.out.print(" ");
                            for(int j=1;j<=n;j++)
                                    System.out.print("*");
                            System.out.println();
                        }


        // *****
        //  *   *
        //   *   *
        //    *   *
        //     *****
                        for(int i=n;i>=1;i--){
                            for(int j=1;j<=(n-i);j++)
                                System.out.print(" ");
                            for(int j=1;j<=n;j++){
                                if(i==1 || i==n || j==1 ||  j==n)
                                    System.out.print("*");
                                else 
                                    System.out.print(" ");
                            }
                        System.out.println();
                        }

        // *
        // **
        // ***
        // ****
        // *****
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=i;j++)
                                    System.out.print("*");
                            System.out.println();
                        }
        
        // *
        // **
        // * *
        // *  *
        // *****
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=i;j++){
                                if(j==1 || i==n || j==i)    
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            }
                            System.out.println();
                        }

        //     *
        //    **
        //   ***
        //  ****
        // *****
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=n-i;j++)
                                System.out.print(" ");
                            for(int j=1;j<=i;j++)
                                System.out.print("*");
                            System.out.println();
                        }

        //     *
        //    **
        //   * *
        //  *  *
        // *****
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=n-i;j++)
                                System.out.print(" ");
                            for(int j=1;j<=i;j++){
                                if(j==1 || i==n || j==i)    
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            }
                            System.out.println();
                        }

        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=i;j++)
                                System.out.print(i);
                            System.out.println();
                        }

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=i;j++)
                                System.out.print(j);
                            System.out.println();
                        }

        // 1
        // 2 1
        // 3 2 1
        // 4 3 2 1 
        // 5 4 3 2 1
                        for(int i=1;i<=n;i++){
                            for(int j=i;j>=1;j--)
                                System.out.print(j);
                            System.out.println();
                        }

        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1 
        // 1 0 1 0 1
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=i;j++){
                                if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0))
                                    System.out.print(1);
                                else
                                    System.out.print(0);
                                }
                            System.out.println();
                        }

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10 
        // 11 12 13 14 15
                        int counter=1;
                        for(int i=1;i<=n;i++){
                            for(int j=1;j<=i;j++)
                                System.out.print((counter++) +" ");
                        System.out.println();
                        }

    }
}
