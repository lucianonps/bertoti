package com.example.Teste;

import com.example.Model.Socio;

public class informacao {
    public static Socio buildAluno(Integer id) {

        Socio socio = new Socio(
                id,
                "NomeSocio",
                20,
                Long.valueOf(000000000));

        return socio;
    }

}
