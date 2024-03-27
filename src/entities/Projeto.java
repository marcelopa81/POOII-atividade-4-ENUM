package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Projeto {

	private String nome;
	private Date dataInicio;
	private Date dataTermino;
	private List<Contratacao> listaContratacao;
	
	public Projeto(String nome, Date dataInicio, Date dataTermino) {
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.listaContratacao = new ArrayList<Contratacao>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataInicio, dataTermino, listaContratacao, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		return Objects.equals(dataInicio, other.dataInicio) && Objects.equals(dataTermino, other.dataTermino)
				&& Objects.equals(listaContratacao, other.listaContratacao) && Objects.equals(nome, other.nome);
	}
	
	


	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", dataInicio=" + dataInicio + ", dataTermino=" + dataTermino + "]";
	}

	public boolean adicionarContratacao (Contratacao c) {
		if (c != null && !listaContratacao.contains(c)) {
			this.listaContratacao.add(c);
			return true;
		}
		return false;
	}
	
	public boolean removeContratacao(Contratacao c) {
		if (c != null || !listaContratacao.isEmpty() || listaContratacao.contains(c)) {
			this.listaContratacao.remove(c);
			return true;
		}
		return false;
	}
	
	public void listarContratacao() {
		if(this.listaContratacao.isEmpty()) {
			System.out.println("O projeto " + this.nome + " não possui contratações!");
		}
		
		if (!this.listaContratacao.isEmpty()) {
			System.out.println("**Contratações**\n" + "Projeto: \n\t" + this.nome +
						"\nFuncionário(s): ");
			for (Contratacao c : listaContratacao) {
				System.out.println("\t" + c.getFuncionario().getNome() +
						" [Status: " + c.getStatus() + "]");
			}
		}
	}
}
