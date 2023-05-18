package com.example.Model;

public class Socio {
    private int id;
    private String name;
    private Long telefone;
    private Integer idade;

    public Socio() {

    }

    public Socio(int id, String name, Integer idade, Long telefone) {
        this.id = id;
        this.name = name;
        this.idade = idade;
        this.telefone = telefone;
    }

    public Mensalidade buscarMensalidadePorId(Clube ac, Integer id) {
        for (Mensalidade m : ac.getMensalidade()) {
            if (m.getId() == id) {
                return m;
            }
        }

        return null;
    }

    public Mensalidade buscarMensalidadePorAluno(Clube ac, Socio socio) {
        for (Mensalidade m : ac.getMensalidade()) {
            if (m.getSocio() == socio) {
                return m;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
