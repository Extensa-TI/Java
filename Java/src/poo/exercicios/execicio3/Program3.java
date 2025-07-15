package poo.exercicios.execicio3;

import java.util.Locale;
import java.util.Scanner;


public class Program3 {

	/*
	 * Fazer um programa para ler o nome de um aluno e as três notas que ele
	 * obteve no três trimestres do ano(primeiro trimestre vale 30 e o segundo e o terceito
	 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno
	 * está aprovado (PASS) ou (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter
	 * o mínimo para ser aprovado (o que é 60% da nota). Você deve criar uma classe Strudent para resolver
	 * o problema
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f POINTS%n", student.finalGrade());
		
		if(student.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		sc.close();
		
	}

}
