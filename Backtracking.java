import java.util.*;
public class Backtracking{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void changeArray(int arr[],int i,int val){
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArray(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void findSubset(String str,int i,String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        findSubset(str, i+1, ans+str.charAt(i));
        findSubset(str, i+1, ans);
    }
}