import java.util.*;
public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Whether a number is power of 2 or not.
                            // int bitMask = (n & (n-1));

                            // if(bitMask == 0)
                            //     System.out.println("Power of 2");
                            // else
                            //     System.out.println("not Power of 2");

        //Toggle bits
            System.out.println("Before toggling: "+n);
            if(n==0){
                System.out.println("After toggling: 1");
                System.exit(0);
            }

                int ans = 0;
                int nextSetBit = 1;
                int lastBit;
                while(n!=0){
                    lastBit = n&1;
                    if(lastBit==0)
                        ans = ans|nextSetBit;
                    nextSetBit <<=1;
                    n >>=1;
                }
                System.out.println("After toggling: "+ans);
       
    }
}
