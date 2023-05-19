package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.example.Model.Clube;
import com.example.Teste.informacao;

/**
 * Unit test for simple App.
 */
class AppTest {

    @Test
    public void SociosListEmpty() {
        Clube clube = new Clube();

        assertEquals(0, clube.getSocio().size());
    }

    @Test
    public void SocioListHasOne() {
        Clube clube = new Clube();

        clube.AddSocio(informacao.buildSocio(new Random().nextInt()));
        assertEquals(1, clube.getSocio().size());
    }

    @Test
    public void SociosListHasMany() {
        Clube clube = new Clube();

        clube.AddSocio(informacao.buildSocio(new Random().nextInt()));
        clube.AddSocio(informacao.buildSocio(new Random().nextInt()));
        clube.AddSocio(informacao.buildSocio(new Random().nextInt()));
        assertEquals(3, clube.getSocio().size());
    }

}
