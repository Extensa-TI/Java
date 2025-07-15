package basico;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) throws Exception {
        //entradaDadosString();
        //entradaDadosInt();
        //entradaDadosDouble();
        //entradaDadosCaracter();
        //entradaDadosVarios();
        //entradaDadosAteQuebraDeLinha();
        entradaDadosQuebraDeLinhaPendente();
    }

    static void entradaDadosString()
    {
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();
        System.out.println("Voce digitou " + x);
        sc.close();

    }

    static void entradaDadosInt()
    {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("O valor de x: " + x);
        sc.close();
    }

    static void entradaDadosDouble()
    {
        Locale.setDefault(Locale.US);
        double x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        System.out.println("O valor digitado foi: " + x);
        sc.close();
    }

    static void entradaDadosCaracter()
    {
        char x;
        Scanner sc = new Scanner(System.in);
        x = sc.next().charAt(0);
        System.out.println("Você digitou : " + x);
        sc.close();

    }

    static void entradaDadosVarios()
    {
        Locale.setDefault(Locale.US);
        String x;
        int y;
        double z;
        Scanner sc = new Scanner(System.in);
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados Digitados");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        sc.close();
    }

    static void entradaDadosAteQuebraDeLinha()
    {
        Scanner sc = new Scanner(System.in);
        String x1,x2,x3;

        x1 = sc.nextLine();
        x2 = sc.nextLine();
        x3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        sc.close();
    }

    static void entradaDadosQuebraDeLinhaPendente()
    {
        Scanner sc = new Scanner(System.in);
        
        int x;
        String x1, x2, x3;

        x = sc.nextInt();
        sc.nextLine();  // corrige a quebra de linha pendente
        x1 = sc.nextLine();
        x2 = sc.nextLine();
        x3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS");
        System.out.println(x);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        sc.close();

    }
}
