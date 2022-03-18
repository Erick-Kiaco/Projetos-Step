package sistemabancario;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(TipoDocumento tipoDocumento, String numeroDocumento) {
		super(tipoDocumento, numeroDocumento);
		setNome("Thiago Lins");
		setEmail("Lins@gmail.com");
	}

}
