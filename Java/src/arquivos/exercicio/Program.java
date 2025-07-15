package arquivos.exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*
	 * Fazer um programa para ler o caminho de um aquivo .csv contendo dados
	 * de itens vendidos. Cada item possui um nome, preço unitário e quantidade
	 * separadoa por vírgula. Você deve gerar um novo arquivo chamado symmary.csv,
	 * contendo apenas o nome e o valor total para aquele item (preço unitário
	 * multiplicado pela quantidade.
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "C:\\\\Users\\\\CASA\\\\OneDrive\\\\Documentos\\\\Estudos\\\\Java\\\\Java\\\\res\\\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name,price,quantity));
				
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				
				for(Product item : list) {
					bw.write(item.getName() + "," + String.format("%,2f",item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr + " CREATED");
			}
			catch (IOException e) {
				System.out.println("Error writting file: " + e.getMessage());
			}
		}
		catch (IOException e) {
			System.out.println("Error readint file: " + e.getMessage());
		}
		
		sc.close();
	}

}
