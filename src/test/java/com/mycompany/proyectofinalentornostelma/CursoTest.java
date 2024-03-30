package com.mycompany.proyectofinalentornostelma;


import instituto.Curso;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class CursoTest {

    Curso c;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    c = new Curso("DAM");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }
    @Test
    public void testConstructor() {
        assertNotNull(c);
        assertEquals("DAM", c.getNombre());

    }

}