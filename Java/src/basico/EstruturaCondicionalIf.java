package basico;

import java.util.Scanner;

public class EstruturaCondicionalIf {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas? ");
        hora = sc.nextInt();
        if (hora < 12)
        {
            System.out.println("Bom dia!");
        }    
        else if (hora < 18) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }
            
        sc.close();
    }
}
