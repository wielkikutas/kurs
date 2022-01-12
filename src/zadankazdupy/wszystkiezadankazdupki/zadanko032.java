package zadankazdupy.wszystkiezadankazdupki;

import java.util.Scanner;

public class zadanko032 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
        int a = sc.nextInt();
        System.out.println("podaj drugą liczbe");
        int b = sc.nextInt();
        if (a!=b){
            System.out.println(a+"!="+b);
        }else {
            System.out.println(a+"="+b);
        }
        if (a<b){
            System.out.println(a+"<"+b);
        }else{
            System.out.println(a+">"+b);
        }
        if (a<=b){
            System.out.println(a+"<="+b);
        }else {
            System.out.println(a+">="+b);
        }
    }
}
