package poo.construtores;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	/*
	 * Em um banco, para cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
	 * titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
	 * inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
	 * conta, o depósito não será feito e osaldo inicial da conta será, naturalmente, zero.
	 * 
	 * Importante: uma vez que uma conta bancária foi aberta, o númeo da conta nunca poder ser alterado. Já 
	 * o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo)
	 * 
	 * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso.
	 * O saldo só aumenta por meio de depósitos, e só diminui por meio de saque. Para cada saque realizado, o banco
	 * cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para realizar
	 * o saque e/ou pagar a taxa.
	 * 
	 * Você deve fazer um programa que realize o cadastro de uma conta, dando a opção para seja ou não informado o valor
	 * de deposito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após
	 * cada operação.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		Account account;
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number,holder,initialDeposit);
		}
		else {
			account = new Account(number,holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.print(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}
}
