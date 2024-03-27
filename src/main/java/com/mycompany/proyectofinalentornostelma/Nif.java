/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

/**
 * Clase para crear NIF usando numeros y letras que estan definidas
 * @author Telma Teixiera
 * @version 27/03/2024
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};
    /**
     * 
    */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }
    /**
     *Constructor que pone el numero a 0 y letra vacia
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }
    /**
     * Constructor que recibe un numero y calcula la letra en base a ese numero
     * @param numero Un entero que nos sirve para calcular la letra
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }
    /**
     * Metodo que nos muestra el DNI
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }
    /**
     * Metodo que recibe un numero y permite modificar el NIF
     * @param numero Un entero que permite modificar la letra del NIF
     */
    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }
    /**
     * Metodo que compara si dos NIF son iguales basandose en el numero 
     * @param obj Objeto que detecta el NIF y lo compara con otro 
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
