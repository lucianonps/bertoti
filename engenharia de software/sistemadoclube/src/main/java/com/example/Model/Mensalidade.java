package com.example.Model;

public class Mensalidade {
    private int id;
    private String vencimento;
    private double valor;
    private Socio socio;

    public Mensalidade(int id, String vencimento, Double valor, Socio socio) {
        super();
        this.id = id;
        this.vencimento = vencimento;
        this.valor = valor;
        this.socio = socio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

}
