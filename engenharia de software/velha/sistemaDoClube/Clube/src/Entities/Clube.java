package Entities;

import java.util.ArrayList;
import java.util.List;

public class Clube {
	
	private String Nome;
	private Long telefone;
	private List <Mensalidade> mensalidade= new ArrayList<Mensalidade>();
	private List <Socio> socio = new ArrayList <Socio>();
	
	public Clube() {
		
	}

	public Clube(String nome, Long telefone) {
		Nome = nome;
		this.telefone = telefone;
	}
	
	public void AddSocio(Socio socio) {
		Socio.add(socio);
			
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public List<Mensalidade> getMensalidade() {
		return mensalidade;
	}


	public List<Socio> getSocio() {
		return socio;
	}


	

}
