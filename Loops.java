import java.util.Scanner;

public class Loops {
        void q1(){
            System.out.println("2 times");
        }

        void q2(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");

            int number = sc.nextInt();
            int sum_even= 0;
            int sum_odd= 0;
            
            
            if(number%2==0){
                int i=0;

                while(i<=number){
                    sum_even += i;
                    System.out.println(i);
                    i = i+2;
    
                }
                System.out.println(sum_even);
            }
            else{
                int i=1;
                while(i<=number){
                    sum_odd += i;
                    System.out.println(i);
                    i = i+2;
                }
                System.out.println(sum_odd);
            }



        }


        void q3(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();
            int factorial =1;

            for(int i=num;i!=0;i--){
                factorial *=i;
                System.out.println(i);
            }
            System.out.println("factorial : " + factorial);
        }

        void q4(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();
            for(int i=1; i<=10;i++){
                System.out.println( num + "*" + i + "=" + (num*i));
            }
        }
    }