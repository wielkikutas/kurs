package zadankazdupy.wszystkiezadankazdupki;

import java.util.Scanner;

public class zadanko037 {
    public static void main(String[] args) {
        String odwrocony = "";
        Scanner sc= new Scanner(System.in);
        System.out.println("podaj Stringi");
        String nieodwrocony = sc.nextLine();
        char[] chars=nieodwrocony.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            odwrocony+=chars[i];

        }
        System.out.println(odwrocony);
    }
}
