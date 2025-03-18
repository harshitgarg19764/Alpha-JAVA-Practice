import java.util.Scanner;

public class AdvancePattern {
    public void HollowRectangle(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Row");
            int row = sc.nextInt();
            System.out.println("Enter Column");
            int column = sc.nextInt();

            for(int i=1;i<=row;i++){
                for(int j =1;j<=column;j++){
                    if (i==1||i==row||j==1||j==column) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

    }

    public void InvertedTriangle(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num");
            int num = sc.nextInt();

            for(int i=1;i<=num;i++){
               for(int spc =num;spc>i;spc--){
                System.out.print(" ");
               }
               for(int j=1;j<=i;j++){
                System.out.print("*");
               }
               System.out.println();
            }
    }

    public void InvertedHalfPyramid(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num");
            int num = sc.nextInt();

            for(int i =num;i>0;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    public void FloydTriangle(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num");
            int num = sc.nextInt();
            int n=1;

            for(int i =1;i<=num;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(n + " ");
                    n++;
                }
                System.out.println();
            }

    }
    public void Triangle01() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num");
            int num = sc.nextInt();

            for(int i =1;i<=num;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }

    }

    public void Butterfly(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num");
            int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int l=num-i;l>0;l--){
                System.out.print(" ");
            }

            for(int l=num-i;l>0;l--){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=1;i<=num;i++){
            for(int j=num-i+1;j>0;j--){
                System.out.print("*");
            }

            for(int l=1;l<i;l++){
                System.out.print(" ");
            }

            for(int l=1;l<i;l++){
                System.out.print(" ");
            }

            for(int k=num-i+1;k>0;k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    

    public void Rhombus(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num");
            int num = sc.nextInt();

            for(int i=1;i<=num;i++){
                for(int spc=num-i;spc>0;spc--){
                    System.out.print(" ");
                }
                for(int j=1;j<=num;j++){
                    System.out.print("*");
                }

                System.out.println();
            }
    }

    public void HollowRhombus(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num");
            int num = sc.nextInt();

            for(int i=1;i<=num;i++){
                for(int spc=num-i;spc>0;spc--){
                    System.out.print(" ");
                }
                for(int j=1;j<=num;j++){
                    if(i==1||i==num||j==1||j==num){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }

    public void DiamondPattern(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num");
            int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int spc=num-i;spc>0;spc--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=num;i++){
            for(int spc=1;spc<i;spc++){
                System.out.print(" ");
            }
            for(int j=num-i+1;j>0;j--){
                System.out.print("*");
            }
            for(int k=num-i;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void NumPyramid(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num");
            int num = sc.nextInt();

            for (int i=1;i<=num;i++){
                for(int spc=num-i;spc>0;spc--){
                    System.out.print(" ");
                }
                for(int j=1;j<=(2*i-1);j++){
                    System.out.print(i);
                }
                System.out.println();
            }
    }

    public void PalindromicNum(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num");
            int num = sc.nextInt();

        for(int i=1;i<=5;i++){
            for(int spc=1;spc<=num-i;spc++){
                System.out.print(" ");
            }

            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }

            System.out.println();
        }
    }





}
