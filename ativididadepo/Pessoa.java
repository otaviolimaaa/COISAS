package ativididadepo;

public class Pessoa {

	String nome;
	int idade;
	String endereço;
	String profissao;
	long cpf;
	long rg;

	public String getNome () {
		return nome;
	}
	public void setNome (String nome) {
		this.nome=nome;
	}
	public int getIdade () {
		return idade;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}
	public  String getEndereço () {
		return endereço;
	}
	public void setEndereço (String endereço) {
		this.endereço = endereço;
	}
	public String getProfissao () {
		return profissao;
	}
	public void setProfissao (String profissao) {
		this.profissao = profissao;
	}
public long getCpf () {
	return cpf;
}
public void setCpf (long cpf) {
	this.cpf = cpf;
}
public long getRg () {
	return rg;
}
public void setRg (long rg) {
	this.rg = rg;
}
}


