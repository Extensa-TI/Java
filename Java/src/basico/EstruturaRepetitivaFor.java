package basico;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaFor {
    
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println("Soma = " + soma);
        sc.close();
    }
}
