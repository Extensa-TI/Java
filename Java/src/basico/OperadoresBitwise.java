package basico;

import java.util.Scanner;

public class OperadoresBitwise {
    public static void main(String[] args) throws Exception {

    /*
          &                   |                     ^ 
    C1  C2  C1 E C2      C1   C2   C1 OU C2    C1  C2  C1 XOR C2
    F    F      F         F    F       F        F   F      F
    F    V      F         F    V       V        F   V      V 
    V    F      F         V    F       V        V   F      V
    V    V      V         V    V       V        V   V      F 

    Realizam operacoes lógicas bit bit em valore

    (89) 0101 1001    & 0001 1000 (24)
                      | 0111 1101 (125) 
    (60) 0011 1100    ^ 0110 0101 (101)
    */    

        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        Scanner sc = new Scanner(System.in);
        // testar o sexto bit
        int c1 = sc.nextInt();
        int mask = 0b00100000;
        if ((c1 & mask) != 0) {
            System.out.println("6th bit e verdadeiro!");
        } else {
            System.out.println("6th bit e falso!");
        }
        sc.close();
    }
}
