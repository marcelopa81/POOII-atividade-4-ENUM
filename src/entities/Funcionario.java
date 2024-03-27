package entities;

import java.util.Objects;

public class Funcionario {

	private String nome;
	private String numeroDocumeto;
	private TipoDeDocumento documento;
	
	
	public Funcionario(String nome, TipoDeDocumento documento, String numeroDocumeto) {
		this.nome = nome;
		this.numeroDocumeto = numeroDocumeto;
		this.documento = documento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNumeroDocumeto() {
		return numeroDocumeto;
	}


	public void setNumeroDocumeto(String numeroDocumeto) {
		this.numeroDocumeto = numeroDocumeto;
	}


	public TipoDeDocumento getDocumento() {
		return documento;
	}


	public void setDocumento(TipoDeDocumento documento) {
		this.documento = documento;
	}


	@Override
	public int hashCode() {
		return Objects.hash(documento, nome, numeroDocumeto);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return documento == other.documento && Objects.equals(nome, other.nome)
				&& Objects.equals(numeroDocumeto, other.numeroDocumeto);
	}


	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", numeroDocumeto=" + numeroDocumeto + ", documento=" + documento + "]";
	}
	
	
	
}
