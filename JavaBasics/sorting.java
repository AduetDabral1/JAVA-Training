public class sorting {
    public static void main(String[] args) {
        int A[] = {7,9,4,6,3,8,1,2};
        int n=A.length;
        int temp,index;
        
        //Bubble Sort
                    // boolean val=false;
                    // for(int i=0;i<n-1;i++){
                    //     val=false;
                    //     for(int j=0;j<n-1-i;j++){
                    //         if(A[j]>A[j+1]){
                    //             temp = A[j];
                    //             A[j] = A[j+1];
                    //             A[j+1] = temp;
                    //             val=true;
                    //         }
                    //     }
                    //     if(val==false)
                    //         break;
                    // }

        //Selection Sort
                        // for(int i=0;i<n;i++){
                        //     index = i;
                        //     for(int j=i+1;j<n;j++){
                        //         if(A[index]>A[j])
                        //             index=j;
                        //     }
                        //     temp = A[index];
                        //     A[index] = A[i];
                        //     A[i] = temp;
                           
                        // }

        //Insertion Sort
                        for(int i=0;i<n;i++){
                            int j=i-1;
                            index = A[i];
                            while(j>=0 && index<A[j]){
                                A[j+1]=A[j];
                                j--;
                            }
                            A[j+1]=index;
                        }

        for(int i=0;i<n;i++)
            System.out.print(" "+ A[i]);
    }
    
}
