package com.mycompany.proyectofinalentornostelma;

import instituto.Nif;
import instituto.Persona;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

/**
 * Clase que testea los metodos importantes de la clase Persona
 * @author Telma Teixeira
 * @version 30/03/2024
 */
public class PersonaTest {
    Persona persona = new Persona(12343222, "Juan Pérez", 'M', 25, 6, 1990);
    Persona persona1 = new Persona(12345678, "Juan Pérez", 'M', 25, 6, 1990);
    Persona persona2 = new Persona(12345678, "Pedro Gómez", 'M', 25, 6, 1990);
    Persona persona3 = new Persona(87654321, "Juan Pérez", 'M', 25, 6, 1990);

    @BeforeEach
    public void setUp() {
        persona = new Persona(12343222, "Juan Pérez", 'M', 25, 6, 1990);
        Persona persona1 = new Persona(12345678, "Juan Pérez", 'M', 25, 6, 1990);
        Persona persona2 = new Persona(12345678, "Pedro Gómez", 'M', 25, 6, 1990);
        Persona persona3 = new Persona(87654321, "Juan Pérez", 'M', 25, 6, 1990);

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

    @Test
    public void testEquals() {
        assertTrue(persona1.equals(persona2));
        assertFalse(persona1.equals(persona3));
    }
}
