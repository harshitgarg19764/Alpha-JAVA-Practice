import java.util.*;
import java.util.Arrays;

public class Strings {
    public static boolean pallindromeString(String str){        
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void shortestPath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='N'){
            y ++;
            }
            else if(ch=='S'){
                y --;
            }
            else if(ch=='E'){
                x ++;
            }
            else if(ch=='W'){
                x --;
            }
            else{
                System.out.println("wrong");
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        float shortestPath = (float)Math.sqrt((x2)+(y2));
        System.out.println(shortestPath);
    }

    public static void toUpercase(String str){
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)== ' ' && i<str.length()-1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());

    }
    public static void stringCompression(String str){
        String newStr = "";
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }

        }
        System.out.println(newStr);
    }

    public static void q1(String str){
        //? Count how many times lowercase vowels occurred in a String entered by the user

        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) =='o' || str.charAt(i) =='u' || str.charAt(i) =='A' || str.charAt(i) =='E' || str.charAt(i) =='I'  || str.charAt(i) =='O' || str.charAt(i) =='U'){
                count++;
            }
        }
        System.out.println(count);

    }

    public static void q2(String str1,String str2){
        //? Determine if 2 Strings are anagrams of each other.
        //? What are anagrams?
        //? If two strings contain the same characters but in a different order, they can be said to be
        //? anagrams. Consider race and care. In this case, race's characters can be formed into a study,
        //? or care's characters can be formed into race. Below is a java program to check if two strings
        //? are anagrams or not.

        str1.toLowerCase();
        str2.toLowerCase();
        
        if(str1.length() == str2.length()){
            char arr1 [] = str1.toCharArray();
            char arr2 [] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean result = Arrays.equals(arr1, arr2);

            if(result){
                System.out.println("anagrams");
            }
            else{
                System.out.println("not anagrams");
            }
            
        }
        else{
            System.out.println("not anagrams");
        }


    }
    public static void tolower(String str){
        str.toLowerCase();
        System.out.println(str);
    }

    public static void reverseStr(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
    public static void commtoArr(String str){
        String arr[] =  str.split(",");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int compress(char[] chars) {
       String str = new String(chars);
       StringBuilder sb = new StringBuilder();
       int sum =1;
       for(int i=0;i<str.length();i++){
            int count =1;
            // int sum =0;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                // sum++;
                i++;
            }
            sb.append(str.charAt(i));
            // if(count>1){
                sb.append(count);
            // }
       }
            chars = sb.toString().toCharArray();
            for(int i=0;i<chars.length;i++){
                System.out.println(chars[i]);
            }
            return chars.length;
    }

    //! 443 String-Compression Leetcode
    public int compress443(char[] chars) {

       StringBuilder sb = new StringBuilder();
       int sum =1;
       for(int i=0;i<chars.length;i++){
            int count =1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            sb.append(chars[i]);
            if(count>1){
                sb.append(count);
            }
       }
            char comp[] = sb.toString().toCharArray();
            for(int i=0;i<comp.length;i++){
                chars[i] = comp[i];
            }
            return comp.length;
    }
    //! 14 longest common prefix
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        // Arrays.sort(strs);
        for(int i=0;i<strs[0].length();i++){
            char ch = strs[0].charAt(i);
            boolean bl = true;
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    bl=false;
                    break;
                }
            }
            if(bl==false){
                break;
            }
            else if(bl==true){
                sb.append(ch);
            }


        }                                                                              
            return sb.toString();
    }
}
