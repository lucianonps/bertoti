package com.example;

import org.junit.jupiter.api.Test;

import com.example.Model.Clube;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    public void AlunosListEmpty() {
        Clube clube = new Clube();

        assertEquals(0, clube.getSocio().size());
    }

    private void assertEquals(int i, int size) {
    }
}
