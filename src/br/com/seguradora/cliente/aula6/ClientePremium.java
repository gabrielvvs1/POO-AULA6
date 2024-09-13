package br.com.seguradora.cliente.aula6;

public class ClientePremium extends Cliente {

	public ClientePremium(String nome) {
		super(nome);
	}

	@Override // tras o metodo contratar seguro da classe cliente
	public double contratarSeguro(int idade) {
		// TODO Auto-generated method stub
		double valorBase =  super.contratarSeguro(idade);
		double valorComDesconto = valorBase * 0.90;
		return valorComDesconto;
	}
	
	

}
