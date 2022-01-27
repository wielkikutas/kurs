package zadankazdupy.zdupyklasyalestare;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner kalkulator = new Scanner(System.in);
        System.out.println("podaj 1 liczbe");
        double a = kalkulator.nextDouble();
        System.out.println("podaj 2 liczbe");
        double b = kalkulator.nextDouble();
        System.out.println("wybierz rodzaj dzialania 1-4");
        System.out.println("1.dodawanie");
        System.out.println("2.odejmowanie");
        System.out.println("3.mnożenie");
        System.out.println("4.dzieleni");
        int c = kalkulator.nextInt();

        switch (c) {
            case 1:
                System.out.println("wynik doadawania" + a + b);
                break;
            case 2:
                System.out.println("wynik odejmowania" + (a - b));
                break;
            case 3:
                System.out.println("wynik mnożenia" + a * b);
                break;
            case 4:
                System.out.println("wynik dzielenia" + a / b);
                break;

        }

    }
}
