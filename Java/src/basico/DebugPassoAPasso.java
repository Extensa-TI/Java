package basico;

import java.util.Scanner;
import java.util.Locale;

public class DebugPassoAPasso {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n",preco);

        sc.close();

    }

}
