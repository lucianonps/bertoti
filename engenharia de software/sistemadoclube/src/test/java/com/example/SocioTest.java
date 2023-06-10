package com.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.example.Model.Clube;
import com.example.Model.Mensalidade;
import com.example.Model.Socio;
import com.example.Teste.informacao;

public class SocioTest {

    @Test
    public void MensalidadeId() {
        Clube clube = new Clube();
        Socio socio = informacao.buildSocio(new Random().nextInt());

        clube.AddSocio(socio);

        Mensalidade m = socio.buscarMensalidadePorId(clube, 1);
        assertNotNull(m);

    }

    @Test
    public void MensalidadeSocio() {
        Clube clube = new Clube();
        Socio socio = informacao.buildSocio(new Random().nextInt());

        clube.AddSocio(socio);

        Mensalidade m = socio.buscarMensalidadePorSocio(clube, socio);

        assertNotNull(m);
    }

}
