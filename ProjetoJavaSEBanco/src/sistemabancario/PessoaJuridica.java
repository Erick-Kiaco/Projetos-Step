package sistemabancario;

public class PessoaJuridica extends Pessoa {

	public PessoaJuridica(TipoDocumento tipoDocumento, String numeroDocumento) {
		super(tipoDocumento, numeroDocumento);
		setNome("ErickEnterprise");
		setEmail("ErickEnterprise@gmail.com");
	}

}
