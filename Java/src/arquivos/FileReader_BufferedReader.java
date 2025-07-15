package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_BufferedReader {
    
    public static void main(String[] args) {
        
        //FileReader -> stream de leitura de caracteres
        //BufferedReader-> Mais rápido

        String path = "C:\\Users\\CASA\\OneDrive\\Documentos\\Estudos\\Java\\Java\\res\\filereader_bufferedreader.txt";
        FileReader fr = null;
        BufferedReader bf = null;

        try {
            fr = new FileReader(path);
            bf = new BufferedReader(fr);

            String line = bf.readLine();
            while(line != null) {
                System.out.println(line);
                line = bf.readLine();
            }
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (bf != null)
                {
                    bf.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
