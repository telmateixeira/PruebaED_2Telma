/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Clase que permite crear personas usando el NIF para identificar
 * @author Telma Teixeira
 * @version 27/03/2024
 */


public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Metodo constructor que permite crear Personas con un nombre vacio, genero vacio y fecha de nacimiento 01/01/1990 
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }
    /**
     * Metodo constructor que crea una Persona introduciendo su NIF
     * @param nif Un entero que permite crear un NIF
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }
    
    /**
     * Metodo constructor que permite crear una Persona completa
     * @param nif Un entero que permite crear un NIF
     * @param nombre String para crear el nombre de la persona
     * @param genero Letra para indicar el genero de la persona
     * @param dia Un entero para indicar el dia que nació
     * @param mes Un entero para indicar el mes en el que nació
     * @param ano Un entero para indicar el año de nacimiento
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }
    
    /**
     * Metodo para mostrar la información de la persona 
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Metodo para comprobar que dos Personas son iguales comparando el NIF 
     * @param a Variable para añadir a otra Persona y comparar ambas
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }
    
    /**
     * Metodo para comprobar que dos personas sean iguales usando el NIF
     * @param obj Objeto permite añadir una Persona y compararlas
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Metodo para comprobar si son dos Personas iguales devolviendo 0 si son iguales, -1 si son distintas
     * @param o Variable para introducir una Persona para comparar
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
