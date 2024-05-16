package exercicio3;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
	private String CPF;
	private String nome;
	private String dataNascimento;
	private static Set<Cliente> clientes = new HashSet<>();//lista de todos os clientes
	
	//construtor de cliente, com nome CPF e sua data de nascimento, adicionando-o a
	//lista de todos os clientes
	public Cliente(String nome,String CPF,String dataNascimento) {
		this.nome = nome;
		this.CPF = CPF;
		this.dataNascimento = dataNascimento;
		clientes.add(this);
		
	}
	//metodo para achar um cliente a partir de um CPF
	public Cliente findCliente(String CPF) {
		Cliente cliente=null;
		for(Cliente procurado:clientes) {
			if(procurado.getCPF().equals(CPF)) {
				return procurado;
			}
		}
		return cliente;
	}
	//metodos para retorno das variaveis da classe Cliente
	public String getCPF() {
		return CPF;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	
}
