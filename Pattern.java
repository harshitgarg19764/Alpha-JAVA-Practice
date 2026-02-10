import java.util.Scanner;

public class Pattern {
    void InvertedStar(){
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");

            int number = sc.nextInt();

            for(int i=number;i>0;i--){
                for(int j=i;j>0;j--){
                    System.out.print("*");
                }
                System.out.println("");
            }
    
}

    void HalfPyramid(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");

            int number = sc.nextInt();

            for(int i=1;i<=number;i++){
                for (int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println("");
            }
    }

    void CharacterPyramid(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int number = sc.nextInt();
            char ch ='A';
            for(int i=1;i<=number;i++){
                for(char j=1;j<=i;j++){
                    System.out.print(ch);
                    ch++;
                }
                    System.out.println("");
            }
    }

}