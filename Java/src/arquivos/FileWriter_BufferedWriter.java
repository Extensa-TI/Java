package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {
    public static void main(String[] args) {
        
        String[] lines = new String[] {"Good Morning", "Good Afeternoon", "Good night"};
        String path = "C:\\Users\\CASA\\OneDrive\\Documentos\\Estudos\\Java\\Java\\res\\filewriter_bufferedwriter.txt";

        // Recria o arquivo
        //try (BufferedWriter bw = new BufferedWriter(new FileWriter(path)))
        // Adiciona ao arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true)))
        {
            for (String line : lines)
            {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
