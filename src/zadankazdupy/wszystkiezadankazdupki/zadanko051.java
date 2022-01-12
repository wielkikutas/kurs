package zadankazdupy.wszystkiezadankazdupki;

import java.util.Scanner;

public class zadanko051 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("podaj numerek do stringa");
        String stringi = sc.nextLine();
        int intiger= Integer.parseInt(stringi);
        System.out.println(intiger+" "+intiger*2);
    }
}
