package sistemabancario;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		setTaxa(0);// Não é cobrado taxa na abertura da Conta Poupança.
		setSaldo(100);// Necessário depositar R$100 no momento da abertura.
		setDataAbertura("Quarta-feira,23 de fevereiro de 2022");// Data de abertura da conta.
	}
}
