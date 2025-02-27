import java.util.Scanner;

public class Method {
    void PrimeRange(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();
            for(int j=2;j<=num;j++){
                
                boolean isPrime = true;

                for(int i=2;i<=Math.sqrt(j);i++){
                    if(j%i==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime==true){
                    System.out.println(j);
                }
        }

            
        }

        public void BittoDec(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();
            int decNum=0;
            int pow =0;
            while(num!=0){
                int digit = num%10;
                decNum = decNum + digit*((int)Math.pow(2,pow ));
                pow++;

                num /=10;


            }
            System.out.println(decNum);
        }

        public void DectoBit(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = sc.nextInt();
            int biNum = 0;

            int pow = 0;
            while(num>0){
                int digit = num%2;

                biNum = biNum + digit*((int)Math.pow(10,pow));
                pow++;

                num /=2;

                
            }
            System.out.println(biNum);
        }


        //! METHODS- ASSESMENT

        public int q1(int a,int b,int c){
            int average = (a+b+c)/3;
            return average;
        }

        public boolean q2(int a){
            if(a%2==0){
                return true;
            }
            else{
                return false;
            }

        }

        public void q3(int num){
            int OriginalNum = num;
            int reverse = 0;
            int pow =0;
            while (num>0){
                int digit = num%10;
                reverse = reverse*10 + digit;
                pow++;
                num /=10;
            }
            System.out.println(reverse);
            if(reverse==OriginalNum){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
            
        }

        public void q4(int a , int b){
            int max = Math.max(a, b);
            System.out.println(max);
            int min = Math.min(a, b);
            System.out.println(min);
            int sqrt = (int)Math.sqrt(a);
            System.out.println(sqrt);
            int pow = (int)Math.pow(a, b);
            System.out.println(pow);
            int abs = Math.abs(a);
            System.out.println(abs);


        }
        public void q5(int num){
            int sum = 0;
            while (num>0){
                int digit = num%10;
                sum = sum + digit;
                num /=10;
            }
            System.out.println(sum);
            
        }
        




}
