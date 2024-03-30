package com.mycompany.proyectofinalentornostelma;

import instituto.Nif;
import instituto.Persona;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

public class PersonaTest {
    Persona persona = new Persona(12343222, "Juan Pérez", 'M', 25, 6, 1990);

    @BeforeEach
    public void setUp() {
        persona = new Persona(12343222, "Juan Pérez", 'M', 25, 6, 1990);

    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testConstructorCompleto() {
        assertEquals(new Nif(12343222), persona.getNif());
        assertEquals("Juan Pérez", persona.getNombre());
        assertEquals('M', persona.getGenero());
        assertEquals(LocalDate.of(1990, 6, 25), persona.getNacimiento());
    }

    @Test
    public void testToString() {
        assertEquals("12343222-L\tJuan\tPérez\t\t33", persona.toString());
    }
}
