package arquivos;

import java.io.File;
import java.util.Scanner;

public interface Informacoes_caminho_arquivos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
