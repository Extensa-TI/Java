package map.exercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	
	/*
	 * Na contagem de votos de uma eleição, são gerados vários registros
	 * de votação contendo o nome do candidato e a quantidade de votos 
	 * (fomato .csv) que ele obteve em uma urna de votação. Você deve
	 * fazer um programa para ler os registros de votação a partir de um
	 * arquivo, e dai gerar um relatório consolidado com os totais de cada candidato.
	 */

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votes = new LinkedHashMap<>();

		String path = "C:\\Users\\CASA\\OneDrive\\Documentos\\Estudos\\Java\\Java\\res\\map_exericio.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int count = Integer.parseInt(fields[1]);
				
				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				}
				else {
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
