package sistemabancario;

import java.io.IOException;
import java.util.Scanner;

import sistemabancario.TipoDocumento;

public class Banco {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int op;
		int oc = 0;
		String oc2;
		String oc3 = null;

		PessoaJuridica pj = new PessoaJuridica(null, oc3);
		PessoaFisica pf = new PessoaFisica(null, oc3);
		ContaPoupanca cp = new ContaPoupanca();
		ContaCorrente co = new ContaCorrente();
		ContaInvestimento ci = new ContaInvestimento();

		do {
			System.out.println("-------Menu-------");
			System.out.println("1.Inserir Dados");
			System.out.println("2.Abrir Conta");
			System.out.println("3.Sacar");
			System.out.println("4.Depositar");
			System.out.println("5.Saldo");
			System.out.println("6.Extrato");
			System.out.println("7.Sair------------");
			op = input.nextInt();

			if (op == 1) {
				System.out.println("Tipo de pessoa o senhor(a) deseja:\n1.Jur�dica\n2.F�sica");
				oc = input.nextInt();
				if (oc == 1) {
					System.out.println("Nome do titular da conta �: " + pj.getNome());
					System.out.println("Email da Conta: " + pj.getEmail());
					pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));// Executa o m�todo.
					pj.setNumeroDocumento(pj.getTipoDocumento().gerarNumeroTeste());
					System.out.println(pj);
					System.out.println("Bem vindo ao Banco!!!");
				}
			} else {
				if (oc == 2) {
					System.out.println("Nome do titular da conta �: " + pf.getNome());
					System.out.println("Email da Conta: " + pf.getEmail());
					pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));// Executa o m�todo.
					pf.setNumeroDocumento(pf.getTipoDocumento().gerarNumeroTeste());
					System.out.println(pf);
					System.out.println("Volte sempre!!!");
				}
			}
			if (op == 2) {
				System.out.println("Qual tipo de conta o senhor(a) deseja:\n1.Poupan�a\n2.Corrente\n3.Investimento");
				oc = input.nextInt();
				if (oc == 1) {
					cp = new ContaPoupanca();
					cp.getDataAbertura();
					System.out.println("Conta criada com sucesso!!!");
				} else {
					if (oc == 2) {
						co = new ContaCorrente();
						co.getDataAbertura();
						System.out.println("Conta criada com sucesso!!!");
					} else {
						ci = new ContaInvestimento();
						ci.getDataAbertura();
					}
					System.out.println("Conta criada com sucesso!!!");
				}
			} else if (op == 3) {
				System.out.println(
						"Qual tipo de conta o senhor(a) deseja Sacar:\n1.Poupan�a\n2.Corrente\n3.Investimento");
				oc = input.nextInt();
				if (oc == 1) {
					System.out.println("Saque da Conta Poupan�a: " + cp.sacar(30) + "\nSaque de: 30$");
					System.out.println("Saque realizado com sucesso!!!");
				} else {
					if (oc == 2) {
						System.out.println("Saque da Conta Corrente: " + co.sacar(10) + "\nSaque de: 10$");
						System.out.println("Saque realizado com sucesso!!!");
					} else {
						System.out.println("Saque da Conta de Investimento: " + ci.sacar(0) + "\nSaque de: 0$");
					}
					System.out.println("Saque realizado com sucesso!!!");
				}
				continue;
			} else if (op == 4) {
				System.out.println(
						"Qual tipo de conta o senhor(a) deseja Depositar:\n1.Poupan�a\n2.Corrente\n3.Investimento");
				oc = input.nextInt();
				if (oc == 1) {
					System.out.println("Dep�sito na Conta Poupan�a: " + cp.depositar(20));
					System.out.println("O senhor(a) depositou: 20$");
					System.out.println("Dep�sito realizado com sucesso!!!");

				} else {
					if (oc == 2) {
						System.out.println("Dep�sito na Conta Corrente: " + co.depositar(10));
						System.out.println("O senhor(a) depositou: 10$");
						System.out.println("Dep�sito realizado com sucesso!!!");
					} else {
						System.out.println("Dep�sito na Conta de Investimento: " + ci.depositar(30));
						System.out.println("O senhor(a) depositou: 30$");
					}
					System.out.println("Dep�sito realizado com sucesso!!!");
				}
			} else if (op == 5) {
				System.out.println(
						"Qual tipo de conta o senhor(a) deseja ver o Saldo:\n1.Poupan�a\n2.Corrente\n3.Investimento");
				oc = input.nextInt();
				if (oc == 1) {
					System.out.println("Saldo da sua Conta Poupan�a �: " + cp.getSaldo());
					cp.getTaxa();

				} else {
					if (oc == 2) {
						System.out.println("Saldo da sua Conta Corrente �: " + co.getSaldo());
						co.getTaxa();
					} else {
						System.out.println("Saldo da sua Conta de Investimento �: " + ci.getSaldo());
						ci.getTaxa();
					}

				}
				continue;
			}
			if (op == 6) {
				System.out.println(
						"Qual tipo de conta o senhor(a) deseja ver o Extrato:\n1.Poupan�a\n2.Corrente\n3.Investimento");
				oc = input.nextInt();
				if (oc == 1) {
					cp.salvarSaldo();
					cp.salvarData();

				} else {
					if (oc == 2) {
						co.salvarSaldo();
						co.salvarData();
					} else {
						ci.salvarSaldo();
						ci.salvarData();
					}

				}
				System.out.println("Tipo de pessoa o senhor(a) deseja:\n1.Jur�dica\n2.F�sica");
				oc = input.nextInt();
				if (oc == 1) {
					pj.mostrarExtrato();
				} else {
					if (oc == 2) {
						pf.mostrarExtrato();
					}
				}
			}

		} while (op != 7);
	}
}
