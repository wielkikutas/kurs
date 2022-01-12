package zadankazdupy.wszystkiezadankazdupki;

import java.util.Scanner;

public class zadanko049 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("podaj numerek");
        int numerek = sc.nextInt();
        if (numerek%2==0){
            System.out.println("numerek calkowity 1xd");
        }else{
            System.out.println("numerek nie calkowity czyli nieprzerrzsyy 00xd");
        }
    }
}
