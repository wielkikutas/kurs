package zadankazdupy;

public class cosliczydlo {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < i / 2; j++) {
                if (i % j != 0) {
                    break;
                } else {
                    System.out.println(i);
                }

            }

        }
    }
}