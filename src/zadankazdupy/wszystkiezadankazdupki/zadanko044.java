package zadankazdupy.wszystkiezadankazdupki;

import java.util.Scanner;

public class zadanko044 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("podaj liczbe n");
        int n = sc.nextInt();
        int m= n+n*11+n*111;
        System.out.println(m);
    }
}
