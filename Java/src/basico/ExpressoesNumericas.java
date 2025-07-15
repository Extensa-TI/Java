package basico;

public class ExpressoesNumericas {

    public static void main(String[] args) throws Exception {
        expressoesNumericas();
    }

    static void expressoesNumericas()
    {
        double res = 2 * 6 / 3;
        System.out.println(res);
        
        res = 3 + 2 * 4;
        System.out.println(res);

        res = (3 + 2) * 4;
        System.out.println(res);

        res = 60 / (3 + 2) * 4;
        System.out.println(res);

        res = 60 / ((3 + 2) * 4);
        System.out.println(res);

        res = 14 % 3;
        System.out.println(res);

        res = 19 % 5;
        System.out.println(res);
    }
}
