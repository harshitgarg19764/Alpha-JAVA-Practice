import java.util.Scanner;

public class BitManipulation{
    public static void oddEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        if((n&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
    public static void getBit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            System.out.println("i'th bit is " + "0");
        }
        else{
            System.out.println("i'th bit is " + "1");

        }
    }
    public static void setBit(int n,int i){
        int bitmask = 1<<i;
        System.out.println(n | bitmask);

    }
    public static void clearBit(int n,int i){
        int bitmask = ~(1<<i);
        System.out.println(n&bitmask); 
    }
    public static void updateBit(int n,int i,int newBit){
        if(newBit==0){
            clearBit(n,i);
        }
        else{
            setBit(n, i);
        }
    }
    public static void clearLastBits(int n,int i){
        int bitmask = (~0)<<i;
        System.out.println((n&bitmask));
    }
    public static void clearRangeBits(int n,int i,int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitmask = a|b;
        System.out.println(n&bitmask);
    }

    public static boolean isPowerofTwo(int n){
        return (n&n-1)==0;
    }

    public static int countSetBits(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count ++;
            }
            n = n>>1;
        }
        return count ;
    }
    public static void fastExponentation(int a,int n){
        int ans =1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            a = a*a;
            n= n>>1;
        }
        System.out.println(ans);
    }
    public static void swapNumbers(int x,int y){
        x = x^y;
        y = x^y;
        x= x^y;

        System.out.println("value of x : " + x + " value of y : " + y);
    }
    public static void q3(int n){
        //? Add 1 to an integer using Bit Manipulation.
        //? (Hint : try using Bitwise NOT Operator).

        n = -(~n);
        System.out.println(n);

    }
    public static void q4(char ch){
        // This question is based on a trick, please directly look at the solution.
        //? Convert uppercase characters to lowercase using bits

        //* Method 1:
        // ch = (char) (ch + 32);
        //* Method 2:
        ch = (char)(ch | ' ');

        System.out.println(ch);

    }
}