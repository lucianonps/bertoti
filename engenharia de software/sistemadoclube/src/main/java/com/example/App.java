package com.example;

import com.example.Model.Clube;
import com.example.Model.Mensalidade;
import com.example.Model.Socio;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Clube ac = new Clube();

        Socio a = new Socio();

        ac.setId(1);
        ac.setNome("Clube");
        ac.setTelefone(new Long(123905878));
        ac.addAluno(a);

        System.out.println("___________________________________");

        for (Socio al : ac.getSocio()) {
            System.out.println("Nome: " + al.getName());
            System.out.println("Idade: " + al.getIdade());
            System.out.println("Telefone: " + al.getTelefone());
        }

        System.out.println("___________________________________");

        for (Mensalidade ms : ac.getMensalidade()) {
            System.out.println("Vencimento: " + ms.getVencimento());
            System.out.println("Valor: " + ms.getValor());
            System.out.println("Aluno: " + ms.getSocio().getName());
        }

    }
}
