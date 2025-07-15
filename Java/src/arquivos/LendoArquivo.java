package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivo {

    public static void main(String[] args) {

        String path = "C:\\Users\\CASA\\OneDrive\\Documentos\\Estudos\\Java\\Java\\res\\filereader_bufferedreader.txt";
        File file = new File(path);
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null)
            {
                sc.close();
            }
        }
    }
}
