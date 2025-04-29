import java.util.Scanner;
import java.util.*;

public class TwoDimensionArray {
    void minMax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("row");
        int a = sc.nextInt();
        System.out.println("column");
        int b = sc.nextInt();
        int arr[][]= new int[a][b];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }


            }
        }
        System.out.println(min);
        System.out.println(max);

        

    }

    void spiralMatrix(int num[][]){

        //! retry

        int startRow = 0;
        int startCol = 0;
        int endRow = num.length-1;
        int endCol = num[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int i=startCol;i<=endCol;i++){
                System.out.println(num[startRow][i]);
            }
            //right
            for(int i=startRow;i<=endRow;i++){
                System.out.println(num[i][endCol]);
            }
            // bottom
            for(int i=endCol-1;i>=startCol+1;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.println(num[endRow][i]);
                
            }
            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.println(num[i][startCol]);
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void diaognalSum(int arr[][]){
        int sum =0;

        //? O(n^2)
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==j){
        //             sum = sum + arr[i][j];
        //         }
        //         else if(i+j==arr.length-1 && i!=j){
        //             sum = sum + arr[i][j];
        //         }
        //     }
        // }

        //? optimized code O(n)

        for(int i =0;i<arr.length;i++){
            sum += arr[i][i];
            if(i!=arr.length-i-1)
                sum += arr[i][arr.length-1-i];
        }
        System.out.println(sum);
    }


    public static boolean staircaseSearch(int arr[][],int key){
        int row = 0;
        int col = arr[0].length-1;
        while(row < arr.length && col>=0){
            if(key==arr[row][col]){
                System.out.println(row + "," + col);
                return true;
            }
            else if (key < arr[row][col]) 
            {
              col--;  
            }
            else{
                row++;
            }

        }
        System.out.println("key not found!");
        return false;
    }

    public static void q1(int arr[][]){

        //? Question 1 : Print the number of 7’s that are in the 2d array.
        //? Example :
        //? Input - int[][] array = { {4,7,8},{8,8,7} };
        //? Output - 2

        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static void q2(int arr[][]){

        //? Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
        //? Example :
        //? Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        //? Output - 18

        int sum=0;
        for(int i=0;i<arr[1].length;i++){
            sum += arr[1][i];
        }
        System.out.println(sum);

    }
        public static void q3(int arr[][]){

            //? Question 3 : Write a program to Find Transpose of a Matrix.
            //? What is Transpose?
            //? Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
            //? Matrix
            //? a11 a12 a13
            //? a21 a22 a23
            //? Transposed Matrix
            //? a11 a21
            //? a12 a22
            //? a13 a23

            int trans[][] = new int[arr[0].length][arr.length];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    trans[j][i]=arr[i][j];
                }

            } 
            for(int i=0;i<trans.length;i++){
                for(int j=0;j<trans[0].length;j++){
                    System.out.print(trans[i][j] + " ");
                }
                System.out.println();
            }
        }
}

