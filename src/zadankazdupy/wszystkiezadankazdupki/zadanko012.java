package zadankazdupy.wszystkiezadankazdupki;

import java.util.Scanner;

public class zadanko012 {
    public static void main(String[] args) {
        Scanner dupa = new Scanner(System.in);
        System.out.println("podaj liczbe nr 1");
        int num1 = dupa.nextInt();
        System.out.println("podaj liczbe nr 2");
        int num2 = dupa.nextInt();
        System.out.println("podaj liczbe nr 3");
        int num3 = dupa.nextInt();
        System.out.println("średnia jest rowna= " + (num1 + num2 + num3) / 3);
    }
}
