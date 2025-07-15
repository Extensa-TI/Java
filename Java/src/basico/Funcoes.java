package basico;

import java.util.Scanner;
public class Funcoes {  

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int higher = max(a,b,c);
        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        }
        else if (y > z) {
            return y;
        }
        else {
            return z;
        }
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
