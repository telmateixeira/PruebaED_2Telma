/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package instituto;

/**
 *
 * @author Diurno
 */
public class ProyectoFinalEntornosTelma {

    public static void main(String[] args) {
        Curso c = new Curso("DAM");
        Persona p = new Persona(1325431, "Telma", 'F', 20,3, 2010);
        c.aniadirAlumno(p);
        System.out.println(c.getListaAlumnos());
    }
}
