
public class Recurrsion {
    public static void decNum(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        decNum(n - 1);
    }

    public static void incNum(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        incNum(n - 1);
        System.out.println(n);
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);

    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);

    }

    public static int firstOccurence(int arr[], int i, int key) {
        if (i > arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, i + 1, key);
    }

    public static int lastOccurence(int arr[], int i, int key) {
        if (i > arr.length - 1) {
            return -1;
        }
        int isFound = lastOccurence(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return lastOccurence(arr, i + 1, key);
    }

    public static int xPowN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xPowN(x, n - 1);
    }

    public static int tilingProblem(int n) {
        // base-case
        if (n == 1 || n == 0) {
            return 1;
        }
        // vertical
        int vc = tilingProblem(n - 1);
        // horizontol
        int hc = tilingProblem(n - 2);
        // total
        int total = vc + hc;
        return total;
    }

    public static String removeDuplicate(String s, int i, StringBuilder sb, boolean arr[]) {
        if (i == s.length()) {
            return sb.toString();
        }
        char curr = s.charAt(i);
        if (arr[curr - 'a'] == true) {
            return removeDuplicate(s, i + 1, sb, arr);
        } else {
            arr[curr - 'a'] = true;
            return removeDuplicate(s, i + 1, sb.append(curr), arr);
        }

    }

    public static int friendsPairing(int n){
        //* Given n friends, each one can remain single or can be paired up with some other friend. 
        //* Each friend can be paired only once Find out the total number of ways in which friends
        //* can remain single or can be paired up.
        if(n==1 || n==2){
            return n;
        }
        return friendsPairing(n-1)+ (n-1)*friendsPairing(n-2);
    }
    // public static void printBinaryStrings(int lastPlace,StringBuilder sb){


    // }

    public static boolean powThree(int n){
        if(n==1){
            return true;
        }
        if(n%3==0){
            return powThree(n/3);
        }
        return false;
    }
    public static int numPowThree(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(powThree(arr[i])){
                n++;
            }
        }
        return n;
    }
    public static void binaryString(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return ;
        }
        binaryString(n-1,0, str+"0");

        if(lastplace==0){
            binaryString(n-1,1, str+"1");
        }
    }
//? QUESTION-1
// For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem.
// Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
// Sample Output : 1 5 7 8

//* METHOD-1
public static int[] countOccurrences(int arr[],int newarr[],int key,int count,int i,int j){
if(i==arr.length){
    return newarr;
}
if(arr[i]==key){
    newarr[j]=i;
    return countOccurrences(arr,newarr, key, count+1, i+1,j+1);
}
    return countOccurrences(arr,newarr, key, count+1, i+1,j);
}
//* METHOD-2
public static void countOccurrences1(int arr[],int key,int i){
if(i==arr.length){
    return;
}
if(arr[i]==key){
    System.out.println(i);
}
    countOccurrences1(arr,key,i+1);
}
//? QUESTION-2
public static void stringConversion(int n,String str,String arr[]){
    if(n==0){
        return ;
    }
    stringConversion(n/10, str, arr);
    str+=arr[n%10];
    System.out.print(str + " ");
}
// We are given a string S, we need to find the count of all contiguous substrings
// starting and ending with the same character.
// Sample Input 1 : S = "abcab"
// Sample Output 1 : 7
// There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
// Out of the above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7
// contiguous substrings start and end with the same character.
// Sample Input 2 : S = "aba"
// Sample Output 2 : 4
// The substrings are a, b, a and aba.

public static String countSubstring(String str,int i,int j,int n,String emp,int count){
    if(i>=n){
        System.out.println(count);
        return "";
    }
    if(j==n){
        return countSubstring(str, i+1, i, n, "",count);
    }
    emp+=str.charAt(j);
    if(str.charAt(i)==str.charAt(j)){
        count++;
    }
    return emp +"\n"+ countSubstring(str,i,j+1,n,emp,count);
    
}

public void nCoins(int n,String str){
    if(n==0){
        System.out.println(str);
        return;
    }
    nCoins(n-1, str+'h');
    nCoins(n-1, str+'t');
}
}
