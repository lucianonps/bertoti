package com.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Clube {
    private String Nome;
    private Long telefone;
    private List<Socio> socios = new ArrayList<Socio>();
    private List<Mensalidade> mensalidades = new ArrayList<Mensalidade>();

    public Clube() {

    }

    public void AddSocio(Socio socio) {
        socios.add(socio);

        Mensalidade mensalidade = new Mensalidade(1, "12/10/2022", 100.00, socio);

        mensalidades.add(mensalidade);
    }

    public Socio getSocioByNome(Clube ac, String nome) {
        for (Socio a : ac.getSocio()) {
            if (a.getName().equals(nome)) {
                return a;
            }
        }

        return null;
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
        return mensalidades;
    }

    public List<Socio> getSocio() {
        return socios;
    }

    public void setId(int id) {
    }

}
