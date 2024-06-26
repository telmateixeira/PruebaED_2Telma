/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.Collection;
import java.util.TreeSet;

/**
 * Clase que permite crear cursos en los que se matriculan Personas
 * @author Telma Teixiera
 * @version 27/03/2024
 */
public class Curso {

    protected String nombre;

    protected TreeSet<Persona> listaAlumnos;


   /**
    * Constructor para crear cursos
    *@param nombre recibe el nombre que se le va a asociar al curso
    */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }
    /**
     * Metodo que muestra los alumnos apuntados a la clase
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que permite mostrar todos los cursos con los alumnos inscritos en el
     * @return s Variable que devuelve todo el texto
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }
    /**
     * Metodo para añadir alumnos a la clase
     * @param p Permite añadir personas a la clase
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }

    /**
     * Metodo para mostrar la lista de los alumnos con TreeSet
     * @return listaAlumnos
     */
    public TreeSet<Persona> getListaAlumnos() {
        return listaAlumnos;
    }
}
