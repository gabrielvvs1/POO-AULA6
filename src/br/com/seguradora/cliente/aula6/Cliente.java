package br.com.seguradora.cliente.aula6;

public class Cliente {
	
	private String nome;

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {//parte do encapsulamento
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double contratarSeguro(int idade) {
		
		if(idade <=25) {
			return 3000;
		}else {
			return 2000;
		}
	
	}

}
