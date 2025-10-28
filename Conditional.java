import java.util.Scanner;

public class Conditional {
    int calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter Operator :");
        char operator = sc.next().charAt(0);

        if(operator=='+'){
            System.out.println(num1+num2);
        }
        else if(operator=='-'){
            System.out.println(num1-num2);
        }
        else if(operator=='*'){
            System.out.println(num1*num2);
        }
        else if(operator=='/'){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("Invalid Operation");
        }
        return 0;
}

    void q1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num1 = sc.nextInt();

        if(num1>0){
            System.out.println("Positive");
        }
        else if(num1<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }

    void q2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature :");
        double temp = sc.nextDouble();

        if(temp>100){
            System.out.println("Fever ");
        }
        else{
            System.out.println("No Fever");
        }
    }

    void q3(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;   
        }
    }
        void q4(){
            System.out.println("x = False");
            System.out.println("y = 63");

        }

        void q5(){
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();

            boolean x = (year % 4 ==0) ;
            boolean y = (year % 100 !=0);
            boolean z = ((year % 100 ==0) && (year % 400==0));

            if(x && (y||z)){
                System.out.println("Leap Year");
            }
            else {
                System.out.println("Not A Leap Year");
            }

        }
        }