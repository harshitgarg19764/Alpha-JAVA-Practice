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
}
