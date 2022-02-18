import java.util.*;
public class Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                matrix[i][j] = sc.nextInt();
        

                // Transpose of array
                                            // System.out.println("The array is: ");
                                            // for(int i=0;i<row;i++){
                                            //     for(int j=0;j<col;j++)
                                            //         System.out.print(arr[i][j] + " ");
                                            //     System.out.println();
                                            // }

                                            // System.out.println("The transposed array is: ");
                                            // for(int j=0;j<col;j++){
                                            //     for(int i=0;i<row;i++)
                                            //         System.out.print(arr[i][j] + " ");
                                            // System.out.println();
                                            //     }


                // Spiral Order of Matrix
                                            //     System.out.println("The Spiral Order Matrix is : ");
                                            //     int rowStart = 0;
                                            //     int rowEnd = n-1;
                                            //     int colStart = 0;
                                            //     int colEnd = m-1;
                                        
                                            //     //To print spiral order matrix
                                            //     while(rowStart <= rowEnd && colStart <= colEnd) {
                                            //         //1
                                            //         for(int col=colStart; col<=colEnd; col++) {
                                            //             System.out.print(matrix[rowStart][col] + " ");
                                            //         }
                                            //         rowStart++;
                                        
                                            //         //2
                                            //         for(int row=rowStart; row<=rowEnd; row++) {
                                            //             System.out.print(matrix[row][colEnd] +" ");
                                            //         }
                                            //         colEnd--;
                                        
                                            //         //3
                                            //         for(int col=colEnd; col>=colStart; col--) {
                                            //             System.out.print(matrix[rowEnd][col] + " ");
                                            //         }
                                            //         rowEnd--;
                                        
                                            //         //4
                                            //         for(int row=rowEnd; row>=rowStart; row--) {
                                            //             System.out.print(matrix[row][colStart] + " ");
                                            //         }
                                            //         colStart++;
                                        
                                            //         System.out.println();
                                            //     }
                 }
              
              
    }
