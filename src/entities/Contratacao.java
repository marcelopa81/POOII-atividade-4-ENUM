package entities;

import java.util.Date;

public class Contratacao {
	
	private Date dataContratacao;
	private Funcionario funcionario;
	private Projeto projeto;
	private Cargo cargo;
	private Status status;
	
	public Contratacao(Projeto projeto, Funcionario funcionario, Cargo cargo, Date dataContratacao) {
		this.dataContratacao = dataContratacao;
		this.projeto = projeto;
		this.funcionario = funcionario;
		this.cargo = cargo;
		this.status = status.PENDENTE;
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
		this.status = status.PENDENTE;
	}
	
	public void contratar() {
		if (this.status == status.PENDENTE) {
			this.status = status.CONTRATADO;
		}
	}
	
	public void demitir() {
		if (this.status == status.CONTRATADO) {
			this.status = status.DEMITIDO;
		}
	}
}
