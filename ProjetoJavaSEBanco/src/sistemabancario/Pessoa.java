package sistemabancario;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import sistemabancario.TipoDocumento;

public class Pessoa {
	private TipoDocumento tipoDocumento;
	private String numeroDocumento;
	private String nome;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa(TipoDocumento tipoDocumento, String numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	void mostrarExtrato() throws IOException {

		FileOutputStream arquivo = new FileOutputStream("pastaDados/arquivo.txt");
		PrintWriter pr = new PrintWriter(arquivo);
		pr.println("Extrato:");
		pr.println("Titular da conta: " + getNome());
		pr.println("Email da conta: " + getEmail());
		pr.println(toString());
		pr.close();
		arquivo.close();

		FileInputStream lerArquivo = new FileInputStream("pastaDados/arquivo.txt");

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

	@Override
	public String toString() {
		return "Senhor(a) [Documento=" + tipoDocumento + ", NumeroDocumento=" + numeroDocumento + "]";
	}
}
