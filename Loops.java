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

        void sum(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();
            int sum=0;
            for(int i=0;i<=num;i++){
                sum +=i;
            }
            System.out.println(sum);
        }

        void SquarePattern(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();

            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        void ReverseNumber(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();
            int reverse =0;
            int digit =0;
            while(num!=0){
                digit = num%10;
                System.out.println(digit);

                reverse = reverse*10 + digit;

                num = num/10;
            }
            System.out.println(reverse);
        }

        void PrimeNumber(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();
            boolean isPrime = true;

            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime = false;
                }
                break;
            }
            if(isPrime==true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }


        }

        void Continue(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();

            for(int i =1 ; i<=num;i++){
                if(i%10==0){
                    continue;
                }
                else{
                    System.out.println(i);
                }
            }
        }
    }