package zadankazdupy.wszystkiezadankazdupki;

import java.util.Scanner;

public class zadanko015 {
    public static void main(String[] args) {
        Scanner dupa = new Scanner(System.in);
        System.out.println("podaj wartosc x");
        int x = dupa.nextInt();
        System.out.println("podaj wartosc y");
        int y = dupa.nextInt();
        int z = y;
        y = x;
        x = z;
        System.out.println("x= " + x + " y= " + y);
    }
}
