package entities;

public enum TipoDeDocumento {

	RG ("Registro Geral"),
	CPF ("Cadastro de Pessoa Física"),
	CNPJ ("Cadastro de Pessoa Jurídica");
	
	private String descricao;
	
	TipoDeDocumento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
