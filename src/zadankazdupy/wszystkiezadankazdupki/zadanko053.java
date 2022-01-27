package zadankazdupy.wszystkiezadankazdupki;

import java.util.Scanner;

public class zadanko053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj 1 liczbe");
        int a = sc.nextInt();
        System.out.println("podaj 2 liczbe");
        int b = sc.nextInt();
        System.out.println("podaj 3 liczbe");
        int c = sc.nextInt();
        if (a < b && b < c) {
            System.out.println("true");

        }
    }
}
