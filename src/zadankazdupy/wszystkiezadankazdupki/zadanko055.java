package zadankazdupy.wszystkiezadankazdupki;

import java.util.Scanner;

public class zadanko055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj ile sekund");
        int sekundki = sc.nextInt();
        int minuty = sekundki / 60;
        int godiny = minuty / 60;
        System.out.println(godiny);
    }
}
