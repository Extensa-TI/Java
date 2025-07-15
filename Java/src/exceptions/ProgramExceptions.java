package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramExceptions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        
        try {
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        catch (Exception e) {
            System.out.println("Unexpected error");
        }

        System.out.println("End of program");
        sc.close();
    }

}
