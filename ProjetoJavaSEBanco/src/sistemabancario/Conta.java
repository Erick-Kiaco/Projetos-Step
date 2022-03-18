package sistemabancario;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Conta {
	private String tipoConta;
	private String tipoCliente;
	private String nomeCliente;
	private String dataAbertura;
	private double taxa;
	private double saldo;

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String sacar(double valor) {

		if (valor < saldo) {
			saldo = saldo - valor;
			return "Saque realizado.";
		} else {
			return "Saldo insuficiente!";
		}

	}

	public double depositar(double valor) {
		saldo = saldo + valor;
		return saldo;
	}

	public void salvarData() throws IOException {
		FileOutputStream arquivo = new FileOutputStream("pastaDados/arquivo.txt2");
		PrintWriter pr = new PrintWriter(arquivo);
		pr.println("Data de abertura da conta salva: " + getDataAbertura());
		pr.close();
		arquivo.close();

		FileInputStream lerArquivo = new FileInputStream("pastaDados/arquivo.txt2");

		InputStreamReader input = new InputStreamReader(lerArquivo);// Ler o objeto arquivo.
		BufferedReader br = new BufferedReader(input);// Ler linha por linha.

		String linha;// O que eu quero ler.

		do {
			linha = br.readLine();// Leio.
			if (linha != null) {
				System.out.println(linha);// Imprimo a frase.

			}
		} while (linha != null);

	}

	public void salvarSaldo() throws IOException {
		FileOutputStream arquivo = new FileOutputStream("pastaDados/arquivo.txt2");
		PrintWriter pr = new PrintWriter(arquivo);
		pr.println("Saldo da Conta Salvo: " + getSaldo());
		pr.close();
		arquivo.close();

		FileInputStream lerArquivo = new FileInputStream("pastaDados/arquivo.txt2");

		InputStreamReader input = new InputStreamReader(lerArquivo);// Ler o objeto arquivo.
		BufferedReader br = new BufferedReader(input);// Ler linha por linha.

		String linha;// O que eu quero ler.

		do {
			linha = br.readLine();// Leio.
			if (linha != null) {
				System.out.println(linha);// Imprimo a frase.

			}
		} while (linha != null);
	}
}
