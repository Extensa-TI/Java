package basico;

import java.util.Locale;

public class SaidaDeDados {

    public static void main(String[] args) throws Exception {
        saidaDeDados();
    }
    
    static void saidaDeDados()
    {
        System.out.print("Olá Mundo.");
        System.out.println("Bom dia.");
        int y = 32;
        System.out.println(y);
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f%n",x);
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS%n",x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n.",nome,idade,renda);
    }

}
