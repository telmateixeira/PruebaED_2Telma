package com.mycompany.proyectofinalentornostelma;


import instituto.Curso;
import instituto.Persona;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class CursoTest {

    Curso c;
    Persona alumno1;
    Persona alumno2;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        c = new Curso("DAM");
         alumno1 = new Persona(12345678, "Juan Pérez", 'M', 25, 6, 1990);
         alumno2 = new Persona(87654321, "María López", 'F', 12, 9, 1995);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }
    @Test
    public void testConstructor() {
        assertNotNull(c);
        assertEquals("DAM", c.getNombre());

    }
    @Test
    public void testAñadirAlumno() {
        c.aniadirAlumno(alumno1);
        c.aniadirAlumno(alumno2);

        assertEquals(2, c.getListaAlumnos().size());
        assertTrue(c.getListaAlumnos().contains(alumno1));
        assertTrue(c.getListaAlumnos().contains(alumno2));
    }

    @Test
    public void testToString() {
        c.aniadirAlumno(alumno1);
        c.aniadirAlumno(alumno2);

        String expected = "--------------------DAM-----------------\n" +
                "NumExp\tNIF\t\tNombre\t\tApellidos\n" +
                "-------------------------------------------------\n" +
                "12345678-Z\tJuan\tPérez\t\t33\n" +
                "87654321-X\tMaría\tLópez\t\t28\n";

        assertEquals(expected, c.toString());
    }


}