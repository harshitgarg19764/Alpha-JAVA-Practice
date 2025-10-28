import java.util.Scanner;

public class Variable {
    int q1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("number 1 :");
        int a = sc.nextInt();
        System.out.println("number 2 :");
        int b = sc.nextInt();
        System.out.println("number 3 :");
        int c = sc.nextInt();

        int average = (a+b+c)/3;

        System.out.println("Average is :");
        System.out.println(average);
        return 0;

    }

    int q2(){


        Scanner sc = new Scanner(System.in);
        System.out.println("side of square :");
        int side = sc.nextInt();
        System.out.println("Area is :");

        System.out.println(side*side);

        return 0;

    }

    int q3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cost of Pencil :");
        float pencil = sc.nextInt();
        System.out.println("Cost of Pen :");
        float pen = sc.nextInt();
        System.out.println("Cost of Eraser :");
        float eraser = sc.nextInt();

        float total = pencil + pen + eraser;

        float bill = (18*total)/100 + total ;

        System.out.println(bill);
        return 0;

    }
    int q4(){
        byte b =4;
        char c ='a';
        short s =512;
        int i =1000;
        float f =3.14f;
        double d = 99.9954;

        int result = (int)((f*b) + (i%c) - (d*s));
        // f*b = 12.56 == 12
        // i%c = 10.30 == 30
        // d*s = 51197.6448 == 51197
        System.out.println(result);

        return 0;

    }

    int q5(){
        int $ = 24;
        System.out.println($);

        return 0;
    }
}
