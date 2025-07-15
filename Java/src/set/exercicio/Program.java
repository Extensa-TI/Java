package set.exercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	
	/**
	 * Um site de internet regitra um log de acessos dos usuários. Um rigistro
	 * de log consiste no nome de usuário(apenas uma palabra) e o instante em que
	 * o usuário acessou o site no padrão ISO 8601, separados por espaço.
	 * Fazer um programa que leia o log de acesso a partir de um arquivo, e dai informe
	 * quantos usuários distintos acessaram o site.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner sc = new Scanner(System.in);
        String path = "C:\\Users\\CASA\\OneDrive\\Documentos\\Estudos\\Java\\Java\\res\\set_exercicio_log.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<LogEntry> set = new HashSet<>();
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(username,moment));
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
