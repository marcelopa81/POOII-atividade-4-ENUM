package entities;

import java.util.Date;
import java.util.Objects;

public class Contratacao {
	
	private Date dataContratacao;
	private Funcionario funcionario;
	private Projeto projeto;
	private Cargo cargo;
	private Status status;
	
	public Contratacao(Projeto projeto, Funcionario funcionario, Cargo cargo, Date dataContratacao) {
		this.dataContratacao = dataContratacao;
		this.funcionario = funcionario;
		this.cargo = cargo;
		this.status = Status.PENDENTE;
		projeto.adicionarContratacao(this);
	}

	
	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}


	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Contratacao [dataContratacao=" + dataContratacao + ", funcionario=" + funcionario + ", projeto="
				+ projeto + ", cargo=" + cargo + ", status=" + status + "]";
	}

	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {
		this.status = Status.CONTRATADO;
	}
	
	public void demitir() {
		this.status = Status.DEMITIDO;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cargo, dataContratacao, funcionario, projeto, status);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contratacao other = (Contratacao) obj;
		return cargo == other.cargo && Objects.equals(dataContratacao, other.dataContratacao)
				&& Objects.equals(funcionario, other.funcionario) && Objects.equals(projeto, other.projeto)
				&& status == other.status;
	}
	
	
}
