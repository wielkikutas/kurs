package zadankazdupy;

public class liczbypierwsze {
    public static boolean isPrimeNumber(int liczba)
    {
        if(liczba<2)
        {
            return false;
        }
        for(int i=2; i<=liczba/2; i++)
        {
            if(liczba%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        liczbypierwsze p = new liczbypierwsze();
        boolean a = p.isPrimeNumber(9);
        System.out.println(a);
    }
}