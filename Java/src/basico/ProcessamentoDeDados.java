package basico;

public class ProcessamentoDeDados {

    public static void main(String[] args) throws Exception {
        processamentoDados();
    }

    static void processamentoDados()
    {
        int x = 5;
        double y = 2 * x;
        System.out.println(x);
        System.out.println(y);

        double b,B,h,area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B)/2.0 * h;
        System.out.println(area);

        float bf,Bf,hf;
        bf = 6f;
        Bf = 8f;
        hf = 5f;
        area = (bf+Bf)/2f * hf;
        System.out.println(area);

        int a,c;
        double resultado;
        a = 5;
        c = 2;
        resultado = (double) a/c; // se não fizer casting o resultado é 2.0
        System.out.println(resultado);
    }
}
