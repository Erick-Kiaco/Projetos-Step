package sistemabancario;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		setTaxa(0);// N�o � cobrado taxa na abertura da Conta Poupan�a.
		setSaldo(100);// Necess�rio depositar R$100 no momento da abertura.
		setDataAbertura("Quarta-feira,23 de fevereiro de 2022");// Data de abertura da conta.
	}
}
