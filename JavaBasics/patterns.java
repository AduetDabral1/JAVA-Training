public class patterns {
public static void main(String[] args) {
    int n = 5;

                // *****
                // *****
                // *****
                // *****
                // *****
                    // for(int i=1;i<=n;i++){
                    //     for(int j=1;j<=n;j++)
                    //         System.out.print("*");
                    //     System.out.println();
                    // }




                // *****
                // *   *
                // *   *
                // *   *
                // *****
                    // for(int i=1;i<=n;i++){
                    //     for(int j=1;j<=n;j++){
                    //         if(i==1 || j==1 || i==n || j==n)
                    //             System.out.print("*");
                    //         else
                    //             System.out.print(" ");
                    //     }
                    //     System.out.println();
                    // }




                // *****
                // ** **
                // * * *
                // ** **
                // *****
                    // for(int i=1;i<=n;i++){
                    //     for(int j=1;j<=n;j++){
                    //         if(i==1 || j==1 || i==n || j==n || i==j || i+j==6)
                    //             System.out.print("*");
                    //         else
                    //             System.out.print(" ");
                    //     }
                    //     System.out.println();
                    // }




                //     *****
                //    *****
                //   *****
                //  *****
                // *****
                    // for(int i=1;i<=n;i++){
                    //     for(int j=1;j<=(n-i);j++)
                    //         System.out.print(" ");
                    //     for(int j=1;j<=n;j++)
                    //             System.out.print("*");
                    //     System.out.println();
                    // }




                 //    *****
                //    *   *
                //   *   *
                //  *   *
                // *****
                    // for(int i=1;i<=n;i++){
                    //     for(int j=1;j<=(n-i);j++)
                    //         System.out.print(" ");
                    //     for(int j=1;j<=n;j++){
                    //         if(i==1 || i==n || j==1 ||  j==n)
                    //             System.out.print("*");
                    //         else 
                    //             System.out.print(" ");
                    //     }
                                
                    //     System.out.println();
                    // }



                // *****
                //  *****
                //   *****
                //    *****
                //     *****
                    // for(int i=n;i>=1;i--){
                    //     for(int j=1;j<=(n-i);j++)
                    //         System.out.print(" ");
                    //     for(int j=1;j<=n;j++)
                    //             System.out.print("*");
                    //     System.out.println();
                    // }


                

                // *****
                //  *   *
                //   *   *
                //    *   *
                //     *****
                    // for(int i=n;i>=1;i--){
                    //     for(int j=1;j<=(n-i);j++)
                    //         System.out.print(" ");
                    //     for(int j=1;j<=n;j++){
                    //         if(i==1 || i==n || j==1 ||  j==n)
                    //             System.out.print("*");
                    //         else 
                    //             System.out.print(" ");
                    //     }
                    // System.out.println();
                    // }




                // *
                // **
                // ***
                // ****
                // *****
                    // for(int i=1;i<=n;i++){
                    //     for(int j=1;j<=i;j++)
                    //             System.out.print("*");
                    //     System.out.println();
                    // }



                
                // *
                // **
                // * *
                // *  *
                // *****
                    // for(int i=1;i<=n;i++){
                    //     for(int j=1;j<=i;j++){
                    //         if(j==1 || i==n || j==i)    
                    //             System.out.print("*");
                    //         else
                    //             System.out.print(" ");
                    //     }
                    //     System.out.println();
                    // }



                
                //     *
                //    **
                //   ***
                //  ****
                // *****
                    // for(int i=1;i<=n;i++){
                    //     for(int j=1;j<=n-i;j++)
                    //         System.out.print(" ");
                    //     for(int j=1;j<=i;j++)
                    //         System.out.print("*");
                    //     System.out.println();
                    // }



                
                //     *
                //    **
                //   * *
                //  *  *
                // *****
                    // for(int i=1;i<=n;i++){
                    //     for(int j=1;j<=n-i;j++)
                    //         System.out.print(" ");
                    //     for(int j=1;j<=i;j++){
                    //         if(j==1 || i==n || j==i)    
                    //             System.out.print("*");
                    //         else
                    //             System.out.print(" ");
                    //     }
                    //     System.out.println();
                    // }




                // 1
                // 2 2
                // 3 3 3
                // 4 4 4 4
                // 5 5 5 5 5
                    // for(int i=1;i<=n;i++){
                    //     for(int j=1;j<=i;j++)
                    //         System.out.print(i);
                    //     System.out.println();
                    // }



                
                // 1
                // 1 2
                // 1 2 3
                // 1 2 3 4
                // 1 2 3 4 5
                    // for(int i=1;i<=n;i++){
                    //     for(int j=1;j<=i;j++)
                    //         System.out.print(j);
                    //     System.out.println();
                    // }




                // 1
                // 2 1
                // 3 2 1
                // 4 3 2 1 
                // 5 4 3 2 1
                    // for(int i=1;i<=n;i++){
                    //     for(int j=i;j>=1;j--)
                    //         System.out.print(j);
                    //     System.out.println();
                    // }



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

