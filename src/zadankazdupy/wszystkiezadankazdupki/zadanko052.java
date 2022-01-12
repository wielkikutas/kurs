package zadankazdupy.wszystkiezadankazdupki;

import java.util.Scanner;

public class zadanko052 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the first number");
        int a= sc.nextInt();
        System.out.println("Input the second number");
        int b= sc.nextInt();
        System.out.println("Input the third number");
        int c = sc.nextInt();
        if (a+b==c){
            System.out.println("true");
        }else {
            System.out.println("not true");
        }
    }
}
