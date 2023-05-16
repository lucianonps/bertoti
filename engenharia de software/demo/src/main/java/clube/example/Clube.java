package clube.example;

import java.util.ArrayList;
import java.util.List;

public class Clube {
    private String Nome;
    private Long telefone;
    private List<Mensalidade> mensalidade = new ArrayList<Mensalidade>();
    private List<Socio> socio = new ArrayList<Socio>();

    public Clube() {

    }

    public Clube(String nome, Long telefone) {
        Nome = nome;
        this.telefone = telefone;
    }

    public void addAluno(Socio socio) {
        Socio.add(socio);

        Mensalidade mensalidade = new Mensalidade(1, "12/10/2022", 100.00, socio);

        mensalidade.add(mensalidade);
    }

    public Socio getAlunoByNome(Clube ac, String nome) {
        for (Socio a : ac.getSocio()) {
            if (a.getName().equals(nome)) {
                return a;
            }
        }

        return null;
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

    public void setId() {
    }

}
