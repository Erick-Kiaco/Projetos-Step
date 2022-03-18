package sistemabancario;

import sistemabancario.GeraCpfCnpj;

public enum TipoDocumento {
	CPF {
		@Override
		public String gerarNumeroTeste() {
			// TODO Auto-generated method stub
			return GeraCpfCnpj.cpf();
		}
	},
	CNPJ {
		@Override
		public String gerarNumeroTeste() {
			// TODO Auto-generated method stub
			return GeraCpfCnpj.cnpj();
		}
	};

	public abstract String gerarNumeroTeste();
}
