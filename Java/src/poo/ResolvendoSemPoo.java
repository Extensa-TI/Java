package poo;

import java.util.Locale;
import java.util.Scanner;

public class ResolvendoSemPoo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xa,xb,xc,ya,yb,yc;

        System.out.println("Enter the measures of triangle x: ");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();

        double p = (xa + xb + xc) /2.0;
        double areaX = Math.sqrt(p * (p-xa) * (p - xb) * (p - xc));

        p = (ya + yb + yc) /2.0;
        double areaY = Math.sqrt(p * (p-ya) * (p - yb) * (p - yc));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area: X");
        }
        else {
            System.out.println("Large area: Y");
        }
        sc.close();

    }
}