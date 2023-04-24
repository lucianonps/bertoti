package Entities;

public class Socio {
	private String name;
	private double cpf;
	private Long telefone;
	private Integer idade;
	
	public Socio() {
		
	}

	public Socio(String name, double cpf, Long telefone, Integer idade) {
		this.name = name;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public static void add(Socio socio) {
		// TODO Auto-generated method stub
		
	}
	
	

}
