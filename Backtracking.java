

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
    public static void findPermutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(newStr, ans+curr);
        }
    }
    public static void printBoard(char board[][]){
         System.out.println("-------chess------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][],int row,int col){
            for(int i=row-1;i>=0;i--){
                if(board[i][col]=='Q'){
                    return false;
                }
            }
            for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            return true;   
    }
    public static  int count =0;
    public static void nQueens(char board[][],int row){
        if(row==board.length){
            count++;
            printBoard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] ='Q';
                nQueens(board, row+1);
                board[row][j]='.';
            }
        }
    } 
    
    public static int maze(int i,int j,int row,int col){
        if(i==row-1 && j==col-1){
            return 1;
        }
        if(i==row || j==col){
            return 0;
        }
        return maze(i,j+1,row,col) + maze(i+1,j,row,col);
    }

    public static int ratMaze(int maze[][],int i,int j,int n,int m,boolean visited[][]){
        if(i>=n || j>=m || j<0 || i<0 || visited[i][j] || maze[i][j]==0 ){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int count=0;

        visited[i][j]=true;

        count+=ratMaze(maze,i+1,j,n,m,visited);
        count+=ratMaze(maze,i-1,j,n,m,visited);
        count+=ratMaze(maze,i,j+1,n,m,visited);
        count+=ratMaze(maze,i,j-1,n,m,visited);

        visited[i][j]=false;

        return count;
    }
    public boolean isSafeSudoku(int sudoku[][],int row,int col,int digit){
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        for(int i=0;i<=8;i++){
            if(sudoku[row][i]==digit){
                return false;
            }
        }
        int sRow = (row/3)*3;
        int sCol = (col/3)*3;

        for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;

    }

    public void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
    for(int j=0;j<9;j++){
        System.out.print(sudoku[i][j] + " ");
    }
    System.out.println();
}

    }
    //! if solution exists

    public boolean sudoku(int sudoku[][],int row,int col){
        //base case
        if(row==9){
            return true;
        }
        //recursion
        int nextRow = row ;
        int nextCol = col+1;
        if(col+1==9){
            nextRow =row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
            return sudoku(sudoku, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafeSudoku(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudoku(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }


    //! print all solutions

    //  public void sudoku(int sudoku[][],int row,int col){
    //     //base case
    //     if(row==9){
    //         printSudoku(sudoku);
    //         return;
    //     }
    //     //recursion
    //     int nextRow = row ;
    //     int nextCol = col+1;
    //     if(col+1==9){
    //         nextRow =row+1;
    //         nextCol=0;
    //     }
    //     if(sudoku[row][col]!=0){
    //         sudoku(sudoku, nextRow, nextCol);
    //         return;
    //     }
    //     for(int digit=1;digit<=9;digit++){
    //         if(isSafeSudoku(sudoku,row,col,digit)){
    //             sudoku[row][col]=digit;
    //             sudoku(sudoku,nextRow,nextCol); 
    //             sudoku[row][col]=0;
    //         }
    //     }
    // }

    public static int c=0;

    public static void ludo(int n,String str){
        //base case
        if(n==0){
            c++;
            System.out.println(str);
            return;
        }
        //main kaam
        for(int i=1;i<=6 && i<=n;i++){
            ludo(n-i,str+i);
        }
    }
    
}


