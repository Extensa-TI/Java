package basico;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		vetoresTipos();
		vetoresReferencia();

	}

    public static void vetoresTipos() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];
        for(int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        double avg = sum/vect.length;
        System.out.printf("AVERAGE HEIGHT %.2f%n",avg);
        sc.close();
    }

    public static void vetoresReferencia() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for(int i = 0; i < vect.length;i++) {
            Product prod = vect[i];
            sum += prod.getPrice();
        }
        double avg = sum/vect.length;
        System.out.printf("AVERAGE PRICE %.2f%n",avg);
        sc.close();
    }
}
